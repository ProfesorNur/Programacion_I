import java.util.Scanner;

public class Funciones2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado_a = 0;
        // Área del cuadrado
        System.out.print("Dame  el lado A del cuadrado");
        lado_a = teclado.nextInt();
        System.out.println("El área del cuadrado es: " + calcular_area(lado_a,lado_a));
        // Area del rectángulo
        System.out.println("Dame  el lado B del rectángulo");
        int lado_b = 0;
        lado_b = teclado.nextInt();
        System.out.print("El área del rectángulo es: " + calcular_area(lado_a,lado_b));
    }
    public static int calcular_area(int lado_1, int lado_2) // int a,b
    {
        int area=0;
        area = lado_1 * lado_2;
        System.out.println("Calculando el área...");
        return area;
    }
    
}
