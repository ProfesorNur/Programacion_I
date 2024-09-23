import java.util.Scanner;

// Programa que encuentra la suma de primos, pares e impares dado un número
public class Suma_primos_par_impar {
    public static void main(String[] args)
    {
        //Inicio
        Integer suma_par = 0;
        Integer suma_impar = 0;
        Integer suma_primo = 0;
        Integer contador = 0;
        Integer numero_introducido=0;
        Integer inicio_contador = 0;
        Integer verifica_primo = 0;
        System.out.println("Bienvenido al Sistema");
        System.out.println("=====================");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca valor=");
        numero_introducido = teclado.nextInt();
        System.out.println("valor = "+numero_introducido);
    }
}
