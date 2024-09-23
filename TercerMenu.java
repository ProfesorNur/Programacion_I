import java.util.Scanner;
/*
Descripción: Menu que me da como resultado lo que debo pagar.
 */
public class TercerMenu
{
    public static void main(String args[])
    {
        // Objeto para pedir valores desde teclado
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int cantidad = 0;
        int monto_total = 0;
        int precio_hamburguesa_simple = 15;
        int precio_hamburguesa_doble = 25;
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
                    System.out.print("Cuántos Hamburguesas simples quiere? :  ");
                    cantidad = teclado.nextInt();
                    monto_total = monto_total + (cantidad * precio_hamburguesa_simple);
                    break;
                case 2:
                    System.out.print("Cuántos Hamburguesas dobles quiere? :  ");
                    cantidad = teclado.nextInt();
                    monto_total = monto_total + (cantidad * precio_hamburguesa_doble);
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
        System.out.println("El monto que debe pagar es : " + monto_total);
    }
}
