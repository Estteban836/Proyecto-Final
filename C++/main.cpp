#include <iostream>
#include <vector>
#include "regresion_lineal.h"

int main() {
    // Datos de ejemplo: ventas (x) y precios (y)
    std::vector<double> ventas = {1, 2, 3, 4, 5};
    std::vector<double> precios = {10, 12, 15, 18, 20};

    try {
        // Calcula la regresión lineal (m: pendiente, b: intercepto)
        auto [pendiente, intercepto] = calcularRegresionLineal(ventas, precios);

        std::cout << "Pendiente (m): " << pendiente << std::endl;
        std::cout << "Intercepto (b): " << intercepto << std::endl;

        // Predicción del precio para una nueva cantidad de ventas
        double ventasNuevas;
        std::cout << "Ingrese la cantidad de ventas para predecir el precio: ";
        std::cin >> ventasNuevas;

        double precioPredicho = predecirPrecio(ventasNuevas, pendiente, intercepto);
        std::cout << "El precio predicho es: " << precioPredicho << std::endl;
    } catch (const std::exception& e) {
        std::cerr << "Error: " << e.what() << std::endl;
    }

    return 0;
}
