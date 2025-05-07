# 📦 API de Franquicias - Spring Boot + MySQL

Esta API permite gestionar franquicias, sus sucursales y productos asociados. Desarrollada en Spring Boot, usando MySQL como base de datos y diseñada para ser desplegada en AWS Lambda con API Gateway.

---

## 🚀 Requisitos

- Java 8+
- Maven
- Docker para ejecutar base de datos MySql de forma local

---

## ⚙️ Configuración

1. Clona el repositorio:

git clone https://github.com/jdrm02/franquicias_n.git

## ▶️ Ejecutar localmente

1. Se debera inicializar el docker con el comando "docker-compose up -d" para montar un contenedor con MySql escuchando en el puerto 3306, la configuracion de este docker se puede encontrar en el archivo docker-composer.yml 

IMPORTANTE: Si se modifican las credenciales es importante modificarlas tambien el archivo application.properties ubicado en la ruta src\main\resources

Se podra ver la ejecucion correcta ejecutando el comando "docker ps"

2. Una vez inicializado el contenedor con MySql para la Base de datos se podra proceder a ejecutar el proyecto, para esto nos ubicaremos dentro de la carpeta target y ejecutaremos el comanto "java -jar Franquicias-0.0.1-SNAPSHOT.jar", el proyecto inicializara y se podra proceder a probar las APIS de Forma Local

# 📦 Endpoints

Se adjunta un coleccion Postman (json) para ser importada con los endpoints detallados a continuacion

1. http://localhost:8080/franquicias - Endpoint para crear franquicias
    Recibira un JSON con el nombre de la franquicia

2. http://localhost:8080/sucursales/franquicia/id_franquicia - Endpoint para crear sucursales
    Se debera reemplazar "id_franqucia" por el ID generado en el api de crear franquicias
    Recibira un JSON con el nombre de la sucursal

3. http://localhost:8080/productos/sucursal/id_sucursal - Endpoint para crear productos
    Se debera reemplazar "id_sucursal" por el ID generado en el api de crear sucursales
    Recibira un JSON con el nombre del producto y el stock

4. http://localhost:8080/franquicias/id_franquicia?nombre=FranquiciaNueva - Enpoint para actualizar el nombre de una franquicia
    Se debera reemplazar "id_franqucia" por el ID generado en el api de crear franquicias
    Se debera reemplazar en el parametro nombre el nuevo nombre de la franquicia

5. http://localhost:8080/sucursales/id_sucursal?nombre=SucursalNueva - Enpoint para actualizar el nombre de una sucursal
    Se debera reemplazar "id_sucursal" por el ID generado en el api de crear sucursales
    Se debera reemplazar en el parametro nombre el nuevo nombre de la sucursal

6. http://localhost:8080/productos/id_producto?nombre=ProductoNuevo - Enpoint para actualizar el nombre de un producto
    Se debera reemplazar "id_producto" por el ID generado en el api de crear producto
    Se debera reemplazar en el parametro nombre el nuevo nombre del producto

7. http://localhost:8080/productos/id_producto/stock?stock=999 - Enpoint para actualizar el stock de un producto
    Se debera reemplazar "id_producto" por el ID generado en el api de crear producto
    Se debera reemplazar en el parametro stock la nueva cantidad de stock del producto

8. http://localhost:8080/productos/id_producto - Enpoint para eliminar un producto
    Se debera reemplazar "id_producto" por el ID generado en el api de crear producto

9. http://localhost:8080/franquicias/id_franquicia - Enpoint para consultas una franquicia y su detalle
    Se debera reemplazar "id_franquicia" por el ID generado en el api de crear franquicia

10. http://localhost:8080/sucursales/id_sucursal - Enpoint para consultas una sucursal y su detalle
    Se debera reemplazar "id_sucursal" por el ID generado en el api de crear sucursales

La coleccion se puede encontrar en el archivo FRANQUICIAS.postman_collection.json