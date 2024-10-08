# Proyecto FCAS. Documento de diseño conceptual.
## Objetivos y visión de la aplicación:
### Propósito: 
El propósito de la aplicación es que los usuarios puedan gestionar sus gastos personales del día a día de forma rápida, clara y útil.
### Público objetivo: 
El público objetivo es el de hombre y mujeres adultos de cualquier edad, poniendo especial énfasis en que sea fácilmente utilizable por personas de edad avanzada.
### Valor agregado: 
La aplicación tiene como valores agregados el ser gratuita y muy sencilla de usar, presentando de forma clara los distintos apartados o funcionalidades que soporta. Es una aplicación intuitiva.
##Principales funcionalidades:
-	Registro de gastos e ingresos.
-	Visualización de estadísticas financieras.
-	Configuración de presupuestos.
-	Notificaciones de recordatorios de pagos o metas.
##Estructura de la información:
Las entidades principales de datos serían la entidad Gastos y la entidad Ingresos.
Los gatos se dividen en distintas categorías: agua, electricidad, gas, telecomunicaciones, hipoteca, alquiler, comunidad, compras de ropa y complementos, compras en supermercados, combustible y mantenimiento de vehículos, seguros: de vehículos, de casa, de vida, gastos en restauración o eventos, médico, farmacéuticos, colegios, cursos y suscripciones que pueden ser mensuales o anuales. Aparte una serie de gastos denominados como “otros gastos” que permitan una mayor flexibilidad a la hora de categorizar los gastos. Otros gastos de casa, otras compras, otros gastos en vehículos, otros gastos en seguros, otros gastos en ocio, otros gastos en salud, otros gastos en educación y otras suscripciones.
Los ingresos, por otra parte, se categorizan en: ingresos por nómina, ingresos por otros trabajos, ventas a particulares, donaciones, herencias, cobros de deudas y otros ingresos.
 Ambas entidades no tienen relación entre ellas y no comparten categorías.

## Flujo de la aplicación:
[Enlace a diagrama de flujo (Lucidchart)](https://lucid.app/lucidchart/ba0a8bfe-cadc-4a16-ba8f-ce37af9e8f49/edit?viewport_loc=-975%2C16%2C3224%2C1535%2C0_0&invitationId=inv_5d14c2c4-8c5d-4f05-8340-c8a9c2ea06f4)

Diagrama de flujo:

![Diagrama de flujo de aplicacion](Imagenes/flujo_aplicacion.png)

## Arquitectura de la aplicación:
La app seguirá una estructura de tipo **Model-View-ViewModel (MVVM) ** que usará es este caso** ViewModel** con **LiveData**, **fragmentos** para las vistas y tareas y **Room** para consistencia de datos.
## Principales interacciones y navegación:
El tipo de navegación entre fragmentos se hará con **Navigation**, e implementará una barra lateral y barras de navegación para agilizar la navegación por las distintas pantallas y funcionalidades.
## Tecnologías clave:
En el apartado tecnológico, usaremos las mencionadas tecnologías de **Navigation**, **Fragmentos**, **ViewModel**, **LiveData**, **Room** basado en **SQLite** y **RecyclerView** para representación dinámica de datos. Estará desarrollada en lenguaje **Kotlin**, si bien se hará uso también del lenguaje de consulta **SQL** para acceder a la base de datos.
## Consideraciones adicionales:
### Seguridad: 
**Room**, y por extensión **SQLite en Android**, se encarga de proteger los datos de la base de datos mediante el modelo de seguridad del sistema operativo Android, sin necesidad de hacer nada adicional para restringir el acceso al archivo de la base de datos
### Cifrado de datos: 
Aunque en principio no se implementará el cifrado de datos pues la app no contendrá datos realmente delicados, en caso de que en algún momento del desarrollo se considerara que es necesario se realizaría con **SQLCipher** para añadir cifrado completo de la base de datos.
### Escalabilidad: Posibilidad de añadir nuevas funcionalidades en el futuro.
En fases posteriores del proyecto se considerará añadir nuevas funcionalidades como presupuestos, estadísticas, etc.
