#ifndef REGRESION_LINEAL_H
#define REGRESION_LINEAL_H

#include <vector>
#include <utility> // Para std::pair

// Declaración de la función para calcular la media
double calcularMedia(const std::vector<double>& datos);

// Declaración de la función para calcular la regresión lineal
std::pair<double, double> calcularRegresionLineal(const std::vector<double>& ventas, const std::vector<double>& precios);

// Declaración de la función para predecir el precio
double predecirPrecio(double ventas, double pendiente, double intercepto);

#endif // REGRESION_LINEAL_H
