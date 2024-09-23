import java.lang.Math;

// Programa para calcular las areas de algunas figuras
// geométricas, uso de variables internas
public class CalculodeAreas
{
    public static double PI2=3.1416;
    public static void main(String[] arg)
    {
        // Area de cuadrado = lado * lado
        int lado;
        int area_cuadrado;
        lado = 15;
        area_cuadrado = lado * lado;
        System.out.println("El área del cuadrado de lado="+lado+" es = "+area_cuadrado);
        // Área del rectángulo
        int lado_a, lado_b;
        int area_rectangulo = 0;
        lado_a = 2;
        lado_b = 8;
        area_rectangulo = lado_a * lado_b;
        System.out.println("El área del rectángulo de lado 1="+lado_a
                + " lado 2=" + lado_b + " es = "+area_rectangulo);
        if(lado_a > lado_b)
        {
            System.out.println("El lado 1 es mayor que  el lado 2");
        }
        else
        {
            System.out.println("El lado 2 es mayor que  el lado 1");
        }

        // Area del circulo
        double area_circulo = 4 *  Math.pow(Math.PI, 2);
        double area_circulo2 = 4 *  PI2 * PI2;
        System.out.println(area_circulo);
        System.out.println(area_circulo2);
    }
}
