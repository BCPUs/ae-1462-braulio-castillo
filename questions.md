# Preguntas — Arquitectura en Capas
## 1. ¿Qué es un controlador?
Es la capa que recibe las peticiones HTTP y las envía al servicio.

## 2. ¿Qué responsabilidad tiene la capa de servicio?
Contiene la lógica de negocio de la aplicación.

## 3. ¿Qué hace el repositorio?
Permite acceder y guardar información en la base de datos.

## 4. ¿Qué es una entidad?
Es una clase que representa una tabla de la base de datos.

## 5. ¿Para qué sirve un DTO?
Sirve para transportar datos entre capas sin exponer directamente la entidad.

## 6. ¿Cuál es la diferencia entre Request y Response?
Request contiene los datos que llegan y Response los datos que devuelve la API.

## 7. ¿Por qué separamos la aplicación en capas?
Porque facilita el mantenimiento y la organización del código.

## 8. ¿Qué anotación se usa para un controlador REST y un servicio?
@RestController para el controlador y @Service para el servicio.

## 9. ¿Qué hace @RequestBody?
Convierte el JSON recibido en un objeto Kotlin.

## 10. ¿Cuál es el flujo de un request?
Controller → Service → Repository → Base de Datos → Repository → Service → Controller.
