# Consulta de Pico y Placa

Este proyecto proporciona una interfaz para consultar si un vehículo puede circular en una fecha y hora determinada según las restricciones de Pico y Placa.

## Versiones

- Frontend: Angular v15.2.0
- Backend: Spring Boot v3.2.3

## Funcionalidades

- Consulta por número de placa y comprobación de si un vehículo puede circular en una fecha o día determinado. siguiendo las siguientes restricciones
    - Lunes: placas terminadas en 1 y 2
    - Martes: placas terminadas en 3 y 4
    - Miércoles: placas terminadas en 5 y 6
    - Jueves: placas terminadas en 7 y 8
    - Viernes: placas terminadas en 9 y 0
    - Sábado y Domingo: Todos los vehículos pueden circular
    
- El horario de restricción es de 6:00 a 9:30 y de 16:00 a 21:00
- El formulario de consulta permite ingresar la placa y la fecha actual con la hora.
- Validación para asegurar que la fecha ingresada no sea anterior a la fecha y hora actual.
- Mostrar el resultado con la información de placa del vehículo y un texto que indique si es libre de circular en la fecha y hora ingresada.

## Requisitos Previos

Asegúrese de tener instalado lo siguiente antes de ejecutar la aplicación:

- [Java 17 o superior](https://www.oracle.com/java/)
- [Maven 3.9.6](https://maven.apache.org/)

## Configuración

1. Clone este repositorio: `git clone (https://github.com/asdrubalzp/advlatam-can-circulate-service)`
2. Navegue al directorio del proyecto: `cd advlatam-can-circulate-service`
3. Ejecute la aplicación: `mvn spring-boot:run`
