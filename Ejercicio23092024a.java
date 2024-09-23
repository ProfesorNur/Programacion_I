import java.util.Scanner;

/*
  Descripción: Programa que hace uso del do-while.
  Una simple tabla de multipilicar, pidiendo al
  usuario un número para  multiplicar.
  Fecha: 23-sep-2024
 */
public class Ejercicio23092024a
{
    public static void main(String[] args)
    {
        System.out.println("Bienvenido al Sistema");
        System.out.println("====================");
        int numero = 1;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Ingrese un número (1 a 9) / 0 para salir:  ");
            numero = teclado.nextInt();

            if (numero == 0)
            {
                System.out.println(" -----  Gracias, hasta pronto ----");
            }
            else
            {
                if (numero >=1 && numero <=9)
                {
                    // Hacer la multiplicación
                    System.out.println("Tabla del "+numero);
                    System.out.println("****************");
                    for (int i=1; i<=9; i++)
                    {
                        System.out.println(i + " x " + numero + " = " + (i*numero));
                    }
                }
                else
                {
                    System.out.println("Ingrese un valor entre 1 y 9 para la tabla de multiplicar");
                }
            }

        } while (numero != 0);
        // Imprimir valor digitado
        // System.out.println(numero);
    }
}
