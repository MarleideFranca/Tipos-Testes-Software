import java.util.Scanner;

public class Verificador_Q2 {

    public static int verifica_02(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número (b): ");
        int b = scanner.nextInt();

        int resultado = verifica_02(a, b);
        System.out.println("O MDC (máximo divisor comum) entre " + a + " e " + b + " é: " + resultado);

        scanner.close();
    }
}





