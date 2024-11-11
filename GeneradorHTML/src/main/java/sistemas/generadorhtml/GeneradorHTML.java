/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistemas.generadorhtml;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class GeneradorHTML {

    public static void main(String[] args) {
        System.out.println("Generador de HTML");
        String titulo_cabecera = "";
        System.out.print("Titulo de la página:");
        Scanner teclado = new Scanner(System.in);
        titulo_cabecera = teclado.nextLine();
        Generar_Html(titulo_cabecera);
    }
    
    private static void Generar_Html(String _cabecera)
    {
       // Creacion de variables para  el HTML
        String linea1 = """
                        <!doctype html>
                        <html lang="en">
                          <head>
                            <meta charset="utf-8">
                            <meta name="viewport" content="width=device-width, initial-scale=1">""";   
        String linea2 =  "<title>"+ _cabecera + "</title>";
        String linea3 ="""
                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
                         </head>""";
        // Aqui inicia  el cuerpo del HTML
        String lineacuerpo1 =" <body><div class=\"container\">";
        
        // Card
        
        String lineacuerpo2 = Devolver_Card();
        
        // Aqui es el pie del HTML
        String pielinea1 ="""
                          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
                            </div></body>
                          </html>""";
        
        // Creacion del HTML como archivo
        try
            {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo=new File("pagina.html");
            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir=new FileWriter(archivo,false);

            //Escribimos en el archivo con el metodo write
            escribir.write(linea1);
            escribir.write(linea2);
            escribir.write(linea3);

            // Cuerpo
            escribir.write(lineacuerpo1);
            escribir.write(lineacuerpo2);
            
            // Pie html
            escribir.write(pielinea1);
            //Cerramos la conexion
            escribir.close();
            System.out.print("HTML Generado Correctamente");
            }

            //Si existe un problema al escribir cae aqui
            catch(Exception e)
            {
               System.out.print("HTML No se puedp Generar");
            }
    }
    
    // Opcion Card
    private static String Devolver_Card()
    {
        String nombre_imagen = "";
        String titulo_card = "";
        String texto_card = "";
        String titulo_boton = "";
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese la URL de la imagen");
        nombre_imagen = intro.nextLine();
        System.out.println("Ingrese Titulo del Card");
        titulo_card = intro.nextLine();
        System.out.println("Ingrese Texto del Card");
        texto_card = intro.nextLine();
        System.out.println("Ingrese Titulo del Boton");
        titulo_boton = intro.nextLine();
        String Cadena_Card = "<div class='card' style='width: 18rem;'>"+
                                "<img src='" + nombre_imagen + "' class='card-img-top' alt='...'>"+
                                "<div class='card-body'>"+
                                " <h5 class='card-title'>" + titulo_card + "</h5>"+
                                "<p class='card-text'>" +  texto_card + "</p>"+
                                "<a href='#' class='btn btn-primary'>"+
                                 titulo_boton + "</a> </div></div>";
        return Cadena_Card;
    }
}
