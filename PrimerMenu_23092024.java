import java.util.Scanner;

/*
   Descripción:  Uso y aplicación de menus condicionales.
   Menu de Platos tipicos para desplegar sus  precios.
 */
public class PrimerMenu_23092024
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
            if (opcion >7)
            {
                System.out.println("Ingrese un valor entre 0 a 7 ");
            }
            if (opcion == 1)
            {
                // opcion 1
                System.out.println("Pediste la opcion 1 ");
            } else if (opcion == 2) {
               // opcion 2
                System.out.println("Pediste la opcion 2 ");
            } else if ( opcion == 3) {
                System.out.println("Pediste la opcion 3 ");
            } else if ( opcion == 4) {
                System.out.println("Pediste la opcion 4 ");
            } else if ( opcion == 5) {
                System.out.println("Pediste la opcion 5 ");
            } else if ( opcion == 6) {
                System.out.println("Pediste la opcion 6 ");
            }
        } while( opcion != 0);
    }
}
