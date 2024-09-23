import java.util.Scanner;

public class mcd {
    public static void main(String[] args){
        Integer r,a,b;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese a");
        a = teclado.nextInt();
        System.out.print("Ingrese b");
        b = teclado.nextInt();
        r = a % b;
        while ( r != 0)
        {
            a = b;
            b = r;
            r = a%b;
        }
       System.out.println("El MCD es"+b);
    }

}
