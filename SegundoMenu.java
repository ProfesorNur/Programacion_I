import java.util.Scanner;
/*
Descripción: Menu con uso de switch-case
 */
public class SegundoMenu
{
    public static void main(String arg[])
    {
        // Objeto para pedir valores desde teclado
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("MENÚ DE COMIDAS");
            System.out.println("==============");
            System.out.println("(1) Hamburguesa simple");
            System.out.println("(2) Hamburguesa doble");
            System.out.println("(3) Hamburguesa mix con huevo");
            System.out.println("(4) Lomito simple");
            System.out.println("(5) Lomito doble");
            System.out.println("(6) Pollo a la brasa");
            System.out.println("(7) Pollo a la broaster");
            System.out.println("(0) Salir");
            System.out.println("Ingrese la opción: ");
            opcion = teclado.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("Used eligió la opcion 1");
                    break;
                case 2:
                    System.out.println("Usted eligió la opcion 2");
                    break;
                case 3:
                    System.out.println("Used eligió la opcion 3");
                    break;
                case 4:
                    System.out.println("Used eligió la opcion 4");
                    break;
                case 5:
                    System.out.println("Used eligió la opcion 5");
                    break;
                case 6:
                    System.out.println("Used eligió la opcion 6");
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestro sistema");
                    break;
                default:
                    System.out.println("Ingrese un valor entre 0 a 7 ");
            }
        } while( opcion != 0);
    }
}
