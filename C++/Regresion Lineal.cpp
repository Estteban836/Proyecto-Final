#include "regresion_lineal.h"
#include <numeric> // Para std::accumulate
#include <stdexcept> // Para manejar excepciones

// Función para calcular la media de un vector
double calcularMedia(const std::vector<double>& datos) {
    double suma = std::accumulate(datos.begin(), datos.end(), 0.0);
    return suma / datos.size();
}

// Función para calcular la regresión lineal
// Retorna un par (m, b) donde y = mx + b
std::pair<double, double> calcularRegresionLineal(const std::vector<double>& ventas, const std::vector<double>& precios) {
    if (ventas.size() != precios.size()) {
        throw std::invalid_argument("Los vectores ventas y precios deben tener el mismo tamaño.");
    }

    int n = ventas.size();
    double mediaVentas = calcularMedia(ventas);
    double mediaPrecios = calcularMedia(precios);

    double numerador = 0.0, denominador = 0.0;
    for (int i = 0; i < n; ++i) {
        numerador += (ventas[i] - mediaVentas) * (precios[i] - mediaPrecios);
        denominador += (ventas[i] - mediaVentas) * (ventas[i] - mediaVentas);
    }

    double pendiente = numerador / denominador;
    double intercepto = mediaPrecios - pendiente * mediaVentas;

    return {pendiente, intercepto};
}

// Función para predecir el precio basado en la cantidad de ventas
double predecirPrecio(double ventas, double pendiente, double intercepto) {
    return pendiente * ventas + intercepto;
}
