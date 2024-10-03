import java.util.Scanner;
/*
 Descripción: Uso de funciones, creación de un menú
              llamado de las  áreas de figuras  geométricas
 Fecha:       30-09-2024
 */
public class FuncionCalculoAreas
{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] arg)
    {
        int op = 99;
        while (op  != 0){
            MostrarMenu();
            op = teclado.nextInt();
            switch (op){
                case 1: calcular_cuadrado();
                        break;
                case 2: clacular_rectangulo();
                        break;
                case 3: calcular_circulo();
                        break;
                case 0:
                    System.out.println("Adios");
                        break;
                default:
                     System.out.println("Ingrese un valor entre 0 y 5");

            }
        }
    }

    private static void MostrarMenu()
    {
        System.out.println("MENU PRINCIPAL");
        System.out.println("==============");
        System.out.println("[1] CALCULAR ÁREA DEL CUADRADO.");
        System.out.println("[2] CALCULAR ÁREA DEL RECTÁNGULO.");
        System.out.println("[3] CALCULAR ÁREA DEL CÍRCULO.");
        System.out.println("[0] SALIR.");
        System.out.println("======================================");
        System.out.print("Digite la opción: ");
    }

    private static void calcular_cuadrado()
    {
        System.out.println("El área del cuadrado es:");

    }
    private static void clacular_rectangulo()
    {
        System.out.println("El área del restángulo es:");
    }
    private static void calcular_circulo()
    {
        System.out.println("El área del círculo es:");
    }
}
