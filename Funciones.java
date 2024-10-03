import java.util.Scanner;

public class Funciones {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int lado_a = 0;
        int area = 0;
        // Área del cuadrado
        System.out.print("Dame  el lado A del cuadrado");
        lado_a = teclado.nextInt();
        System.out.println("Calculando el área del cuadrado");
        area = lado_a * lado_a;
        System.out.print("El área del cuadrado es: " + area);
        // Area del rectángulo
        System.out.print("Dame  el lado B del rectángulo");
        int lado_b = 0;
        lado_b = teclado.nextInt();
        System.out.println("Calculando el área del cuadrado");
        area = lado_a * lado_b;
        System.out.print("El área del rectángulo es: " + area);

    }
}
