import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Integer n, primernumero=0, segundonumero = 1;
        Integer numerofibonaci= 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese n = ");
        n = teclado.nextInt();
        System.out.print("Números => 0 - 1");
        for(int i=2;i<n;i++)
        {
            numerofibonaci = primernumero+segundonumero;
            System.out.print(" - "+numerofibonaci);
            primernumero = segundonumero;
            segundonumero = numerofibonaci;

        }
    }
}
