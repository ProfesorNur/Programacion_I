import java.util.Scanner;

/*
Programa donde trabajaremos las cadenas,
 utilizaremos funciones:
    length()
    charAt(int index)
    substring(int beginIndex, int endIndex)
    indexOf(String str)
    lastIndexOf(String str)
    toLowerCase()
    toUpperCase()
    trim()
    replace(char oldChar, char newChar)
    split(String regex)
 */
public class Cadenas
{
    public static void main(String[] args)
    {
        String cadena;
        System.out.print("Ingrese una cadena: ");
        Scanner teclado = new Scanner(System.in);
        cadena = teclado.nextLine();
        // funcion length()
        int tamano = 0;
        tamano = cadena.length();
        System.out.println("La cadena: " + cadena + " tiene " + tamano + " letras");
        // funcion charAt(int index)
        String cadena_inversa = "";
        char letra;
        for (int i=tamano-1;i>=0;i--)
        {
            letra = cadena.charAt(i);
            // System.out.println(letra);
            cadena_inversa = cadena_inversa.concat(String.valueOf(letra));
        }
        System.out.println("La cadena: " + cadena + " invertida es:  " + cadena_inversa);
       // funcion: substring(int beginIndex, int endIndex)
        // devolver los 2 ultimos digitos o letras de una cadena
        String cadena_ultimos = "";
        cadena_ultimos = cadena.substring(tamano-2);
        System.out.println("La cadena: " + cadena + " tiene como 2 últimas letras:  " + cadena_ultimos);
        // funcion : indexOf(String str)
        int indice = 0;
        indice = cadena.indexOf(",");
        if (indice == -1)
        {
            System.out.println("No existe la coma en la cadena");
        }
        else
        {
            System.out.println("la coma se encuentra en la posición: " + indice);
            System.out.println(" la cadena antes de la coma es: " + cadena.substring(0,indice));
            System.out.println(" la cadena despues de la coma es: " + cadena.substring(indice+1));
        }
        // funciones: lastIndexOf(String str)
        //    toLowerCase()
        //    toUpperCase()
        //    trim()
        int ultimo_indice = 0;
        ultimo_indice = cadena.lastIndexOf(",");
        if (ultimo_indice == -1)
        {
            System.out.println("No existe la coma en la cadena");
        }
        else
        {
            System.out.println("la coma se encuentra en la posición: " + ultimo_indice);
            System.out.println(" la cadena antes de la coma es: " + cadena.substring(0,ultimo_indice));
            System.out.println(" la cadena despues de la coma es: " + cadena.substring(ultimo_indice+1));
        }
        System.out.println("La cadena: " + cadena + " en mayusculas es: " + cadena.toUpperCase());
        System.out.println("La cadena: " + cadena + " en minusculas es: " + cadena.toLowerCase());
        System.out.println("La cadena: " + cadena + " sin espacio en blanco al principio/final es " + cadena.trim());

        // Función replace(char oldChar, char newChar)
        String nueva_cadena = "";
        nueva_cadena = cadena.replace(',','*');
        System.out.println("La cadena: " + cadena + " con comas, ahora es: " + nueva_cadena);
        // funcion Split
        String texto = cadena;
        // Usamos la coma como delimitador
        String[] lenguajes = texto.split(",");

        // Imprimimos los resultados
        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }


    }
}
