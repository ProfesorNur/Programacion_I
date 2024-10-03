/*
  Funciones que pasan parámetros por valor
 */
public class FuncionesPorValor
{
    static int nueva_edad = 15; // variable global
    public static void main(String[] args)
    {
        String[] nombres = new String[5];
        nombres[0]="Juan";
        nombres[1]="Pedro";
        nombres[2]="María";
        nombres[3]="Jose";
        nombres[4]="Magdalena";
        int edad = 23;
        for (int i=0; i<=4;i++)
        {
            System.out.println("** Vector "+i+" = "+ nombres[i]);
        }
        /* System.out.println("Edad antes de la función= " + edad);
        System.out.println("** Nueva Edad antes de la función= " + nueva_edad);
        */
        cambiaredad(edad, nombres);
        /*
        System.out.println("** Nueva Edad después de la función= " + nueva_edad);
        System.out.println("Edad despues de la función= " + edad);
        */

        for (int i=0; i<=4;i++)
        {
            System.out.println("** Vector "+i+" = "+ nombres[i]);
        }
    }

    private static void cambiaredad(int edad, String[] nom)
    {
        System.out.println("** Edad al entrar a  la función= " + edad);
        edad += 3;   // edad = edad +3
        nueva_edad +=3;
        System.out.println("Edad al salir de la función= " + edad);
        nom[0] = "eliminado";
        nom[1] = "eliminado";
        nom[2] = "eliminado";
    }
}
