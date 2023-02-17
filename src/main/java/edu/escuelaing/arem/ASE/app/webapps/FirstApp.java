package edu.escuelaing.arem.ASE.app.webapps;

import edu.escuelaing.arem.ASE.app.HttpServer;
import edu.escuelaing.arem.ASE.app.services.*;
import edu.escuelaing.arem.ASE.app.spark.Route;
import edu.escuelaing.arem.ASE.app.spark.Spark;

import java.io.IOException;

public class FirstApp {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        HttpServer server = HttpServer.getInstance();
        //server.addService("/index.html", new RestHTMLService());
        //server.addService("/app.js", new RestJSService());
        //server.addService("/style.css", new RestCSSService());
        //server.addService("/imagen.jpg", new RestJPGService());
        //server.addService("/pagina.html", new RestPaginaService());
        //server.addService("/404", new RestNotFoundService());
        //Spark
        Spark.get("/pagina.html",  (req, res) -> {
            res.setType("text/html");
            return res.getResponse();
        });
        Spark.get("/index.html",  (req, res) -> {
            res.setType("text/html");
            return res.getResponse();
        });
        Spark.get("/app.js",  (req, res) -> {
            res.setType("text/javascript");
            return res.getResponse();
        });
        Spark.get("/style.css",  (req, res) -> {
            res.setType("text/css");
            return res.getResponse();
        });
        Spark.get("/imagen.jpg",  (req, res) -> {
            res.setType("image/jpg");
            return res.getResponse();
        });
        server.run(args);
    }
}
