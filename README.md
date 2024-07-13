<h4 align="center">
  🎓 Alura + ONE
</h4>

<h1 align="center">
  💱 ExchanGo - Conversor de Monedas
</h1>

<p align="center">
  Este documento contiene el desarrollo y la documentación del proyecto ExchanGo del Programa Alura + ONE.
</p>

## 📝 Descripción del Proyecto

ExchanGo es un conversor de monedas desarrollado en Java, que utiliza una API para obtener tasas de cambio actualizadas. La aplicación permite convertir entre varias monedas y presenta una interfaz de consola interactiva.

## 📋 Funcionalidades

- **Selección de Moneda de Origen y Destino**: Permite seleccionar entre ARS (Peso argentino), BOB (Boliviano boliviano), BRL (Real brasileño), CLP (Peso chileno), COP (Peso colombiano) y USD (Dólar estadounidense).
- **Conversión de Monedas**: Convierte la cantidad ingresada de una moneda a otra usando las tasas de cambio obtenidas de la API.
- **Interfaz de Consola**: Presenta un menú interactivo y mensajes claros para guiar al usuario.

## 📁 Estructura del Proyecto

- **`com.thiagov2a.exchango`**: Contiene la clase principal `ExchanGo` que maneja la lógica de interacción con el usuario.
- **`com.thiagov2a.exchango.modelo`**: Define las clases `Moneda` y `MonedaAPI` para representar las monedas y sus datos obtenidos de la API.
- **`com.thiagov2a.exchango.servicio`**: Incluye la clase `ConsultaMoneda` para manejar las consultas a la API.
- **`com.thiagov2a.exchango.util`**: Contiene la clase `ConversionMonedas` para realizar las conversiones de moneda.

## 🚀 Cómo Ejecutar el Proyecto

1. **Clonar el Repositorio**: `git clone https://github.com/tu-usuario/conversor-de-monedas.git`
2. **Configurar la API Key**: Inserte su clave de API en la configuración del proyecto.
3. **Ejecutar el Proyecto**: Utilice su IDE favorito para compilar y ejecutar la clase principal `ExchanGo`.

## 🛠 Tecnologías Utilizadas

- **Java**: 💻 Lenguaje de programación principal.
- **IntelliJ IDEA**: 🧑‍💻 Entorno de desarrollo integrado (IDE) utilizado.
- **Git**: 🌳 Sistema de control de versiones.
- **GitHub**: 🌐 Plataforma de hospedaje de código fuente y colaboración.

<p align="center">
  Alura + ONE | ExchanGo - Conversor de Monedas
</p>
