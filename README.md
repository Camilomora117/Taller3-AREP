# AREP Laboratorio 2

Servidor web que soporte múlltiples solicitudes seguidas (no concurrentes). El servidor puede leer los archivos del disco local y retornar todos los archivos solicitados, incluyendo páginas html, archivos java script, css e imágenes. 

## Iniciando

### Prerequisites

- Java - Ambiente de desarrollo
- Maven - Administrador de dependencias
- Git - Sistema de control de versiones

### Instalando el entorno

Descargamos el archivo .zip o lo clonamos con el comando:

```
git clone https://github.com/Camilomora117/Taller2-AREP.git
```

Una vez descargado el repositorio nos dirigimos al directorio raiz del proyecto y ejecutamos el comando:

```
mvn clean package exec:java
```

Finalmente ingrese al navegador de su preferencia y usamos el link (El cual es el localhost que corre por el puerto 35000):
http://localhost:35000

#Para usar los servicios
Si desea usar los servicios necesita las siguientes rutas

```
http://localhost:35000/apps/index.html
```

```
http://localhost:35000/apps/style.css
```

```
http://localhost:35000/apps/imagen.jpg
```

```
http://localhost:35000/apps/app.js
```

Ademas una pagina web donde involucra todos los archivos:

```
http://localhost:35000/apps/pagina.html
```

## Documentación

Para visualizar la documentación de javadoc ejecutamos el comando: 

```
mvn javadoc:javadoc
```

Y entramos a la siguien ruta:

```
...\miprimera-app\target\site\apidocs
```

## Corriendo Tests unitatios

Nos ubicamos en el directorio principal del repositorio y ejecutamos el comando:

```
mvn test
```

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management

## Versonamiento

Versión 1.0

## Autores

* Yesid Camilo Mora Barbosa (camilomora117)

## Explicaciones

* Extensibilidad: Para cambiar la API de la cual se obtiene la informacion de las peliculas, solo se debe modificar la url donde se optiene la información.

* Patrones: Hacemos uso del patron de diseño Fachada, puesto que la clase Cache recibe toda la consulta inicialmente y antes de preguntarle a la API revisa si ya se encuentra información guardada en el cache.

* Modular: En HttpServer tenemos el servidor el cual es el metodo main que inicia la conexión del socket en espera de solicitudes de información de peliculas, esta a su vez crea la tabla respectiva del JSON que contiene la información de la pelicula buscada. La clase Cache unicamente guarda la informacion de peliculas que ya se buscarón anteriormente para que no se busque de nuevo. Por ultimo HttpConnection realiza el enlace entre la API de peliculas y el socket creado por HttpServer.
