import java.util.Scanner;

public class FuncionMultiplicar
{
    public static void main(String[] args)
    {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Número de la tabla: (0:Salir) ");
            numero = teclado.nextInt();
            Mostrar_tabla(numero);
        } while (numero != 0);
    }

    // Procedimiento
    public static void Mostrar_tabla(int multiplicador)
    {
        System.out.println("Tabla del "+ multiplicador);
        System.out.println("========================");
        for (int i=1;i<=10; i++)
        {
            System.out.println(i + " x " + multiplicador + " = " + (i*multiplicador));
        }
        System.out.println("========================");
    }
}
