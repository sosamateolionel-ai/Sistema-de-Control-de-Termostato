# Sistema de Control de Termostato

## Descripción

Este proyecto consiste en un sistema de control de temperatura desarrollado en Java. Permite administrar la temperatura actual de un termostato y configurar su modo de operación mediante métodos que validan los valores ingresados.

El sistema utiliza encapsulamiento para proteger sus atributos y evitar modificaciones que incumplan las condiciones establecidas.

## Funcionamiento

El programa crea un termostato con una temperatura inicial de 22 °C y el modo de operación automático. Después realiza distintas pruebas:

* Consulta la temperatura y el modo de operación iniciales.
* Ajusta la temperatura a valores válidos.
* Acepta los límites de temperatura de 15 °C y 30 °C.
* Rechaza temperaturas fuera del rango permitido.
* Cambia el modo de operación a frío o calor.
* Rechaza modos inexistentes o valores nulos.
* Intenta crear un termostato con una temperatura inicial inválida y captura la excepción correspondiente.

Cuando una modificación no es válida, el termostato conserva su último valor correcto.

## Clases principales

### `Termostato`

Representa el dispositivo y contiene los siguientes atributos privados:

* `TEMPERATURA_MINIMA`: constante que establece la temperatura mínima permitida de 15 °C.
* `TEMPERATURA_MAXIMA`: constante que establece la temperatura máxima permitida de 30 °C.
* `temperaturaActual`: temperatura actual del dispositivo.
* `modoOperacion`: modo de funcionamiento, que puede ser `frio`, `calor` o `automatico`.

**Métodos principales:**

* `getTemperatura()`: devuelve la temperatura actual.
* `setTemperatura()`: valida y modifica la temperatura si está dentro del rango permitido.
* `getModoOperacion()`: devuelve el modo de operación actual.
* `setModoOperacion()`: cambia el modo si el valor ingresado es válido.
* `esTemperaturaValida()`: verifica que la temperatura esté dentro de los límites establecidos.
* `esModoValido()`: comprueba que el modo pertenezca a las opciones permitidas.

Los métodos de validación son privados para mantener las reglas internas protegidas y reutilizarlas tanto en el constructor como en los métodos de modificación.

### `Main`

Contiene el método principal del programa. Crea un termostato, prueba distintas temperaturas y modos de operación, y comprueba el manejo de errores mediante excepciones.

## Conceptos de programación utilizados

* **Encapsulamiento:** los atributos son privados y se modifican mediante métodos controlados.
* **Validación de datos:** se comprueban las temperaturas y los modos antes de aceptar cambios.
* **Métodos getters y setters:** permiten consultar y modificar los atributos de forma controlada.
* **Constantes con `static final`:** establecen los límites de temperatura compartidos por todos los objetos de la clase.
* **Métodos privados:** ocultan las reglas internas de validación.
* **Excepciones:** `IllegalArgumentException` impide crear un termostato con valores iniciales inválidos.
* **Condicionales:** permiten aceptar o rechazar las modificaciones.
* **Manejo de valores nulos:** las comparaciones de cadenas evitan errores cuando el modo recibido es `null`.

## Ejecución

<img width="958" height="663" alt="image" src="https://github.com/user-attachments/assets/5e31c83a-9e18-4e64-b3a0-32001fa0c9c5" />

## Objetivo del ejercicio

Aplicar los principios de encapsulamiento y validación de datos mediante un termostato que permita controlar la temperatura y el modo de operación sin admitir valores inválidos.
