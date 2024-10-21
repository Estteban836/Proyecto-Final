Sistema de Gestión de Productos
Presentación
El Sistema de Gestión de Productos es una aplicación en Java diseñada para facilitar la gestión de productos en un inventario. Permite a los usuarios:

Registrar productos con nombre, precio y cantidad disponible.
Registrar ventas de productos.
Mostrar la lista de productos y sus precios.
Predecir precios utilizando un modelo de regresión lineal implementado en C++.
Estructura del Proyecto
src/: Contiene las clases principales (Producto.java, Inventario.java, SistemaGestion.java, Main.java).
cpp/: Incluye el código C++ para la regresión lineal (regresion_lineal.cpp) y un Makefile opcional.
README.md: Proporciona instrucciones y detalles del proyecto.

Comentarios del Proyecto
Lenguajes y Herramientas Utilizadas
Java:

Lenguaje de programación: Se utilizó Java para desarrollar la lógica principal del sistema de gestión de productos. Java permite la programación orientada a objetos, facilitando la creación y manejo de clases como Producto e Inventario.
Clases principales:
Producto: Representa los productos en el sistema, incluyendo atributos como nombre, precio base y cantidad disponible.
Inventario: Maneja el registro de productos y las operaciones de venta.
SistemaGestion: Contiene la lógica para la interacción con el usuario a través de la consola, incluyendo el menú de opciones y la gestión de la predicción de precios.
Main: Punto de entrada del programa que inicia la aplicación.
C++:

Lenguaje de programación: Se utilizó C++ para implementar el algoritmo de regresión lineal que predice los precios de los productos. La elección de C++ se debió a su eficiencia y rendimiento en cálculos numéricos.
regresion_lineal.cpp: Este archivo contiene la lógica para calcular los precios utilizando un modelo de regresión lineal. Se diseñó para recibir datos de entrada, procesarlos y generar predicciones que se integran en la aplicación Java.
Integración: El programa en Java invoca el ejecutable de C++ a través de un proceso, permitiendo la ejecución de cálculos en C++ y la lectura de sus resultados en la consola de Java.
Funcionamiento General
Interacción con el Usuario: El sistema opera mediante un menú en la consola que permite al usuario elegir diferentes acciones como registrar productos, realizar ventas y predecir precios.
Predicción de Precios: Cuando se selecciona la opción de predicción de precios, el programa de Java ejecuta el programa de C++, el cual realiza los cálculos necesarios y devuelve los resultados a la consola de Java.
Manejo de Errores: Se implementan medidas para manejar posibles errores durante la ejecución, asegurando que la experiencia del usuario sea fluida.
