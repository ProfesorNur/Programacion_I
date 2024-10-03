import java.util.Scanner;

/*
  Programa que  controla mediante
  un procedimeinto / Función un menu.
 */
public class MenuOpciones
{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String arg[])
    {
        int op = 99;   // Variable para  controlar las opciones del menu
        do {
            MostrarMenu();
            op = teclado.nextInt();
            switch (op)
            {
                case 1: foo(1);
                     break;
                case 2: foo(2);
                    break;
                case 3: foo(3);
                    break;
                case 4: foo(4);
                    break;
                case 5: foo(5);
                    break;
                case 0: foo(0);
                    break;
                default:
                    System.out.println("Digite  un valor entre 0 a 5");
            }
        }while(op != 0);
    }

    private static void foo(int vfoo)
    {
        System.out.println("Foo = "+vfoo);
    }
    private static void MostrarMenu()
    {
        System.out.println("====================");
        System.out.println("  MENU PRINCIPAL  ");
        System.out.println("====================");
        System.out.println("[1]:   OPCION 1");
        System.out.println("[2]:   OPCION 2");
        System.out.println("[3]:   OPCION 3");
        System.out.println("[4]:   OPCION 4");
        System.out.println("[5]:   OPCION 5");
        System.out.println("[0]:   SALIR");
        System.out.print("Digite una opción: ");
    }
}
