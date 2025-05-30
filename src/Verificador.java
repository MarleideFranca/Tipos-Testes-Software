import java.util.Scanner;

/**
 * Classe responsável por verificar se um número é palíndromo.
 */
public class Verificador {

    /**
     * Verifica se um número é palíndromo.
     *
     * @param numero Número inteiro positivo a ser verificado.
     * @return true se for palíndromo, false caso contrário.
     */
    public static boolean verifica(int numero) {
        int original = numero;
        int reverso = 0;

        while (numero > 0) {
            int digito = numero % 10; // Pega o último dígito
            reverso = reverso * 10 + digito; // Constrói o número invertido
            numero /= 10; // Remove o último dígito
        }

        return original == reverso;
    }

    /**
     * Método principal que interage com o usuário e mostra o resultado.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Verificador de Palíndromo ===");
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Digite apenas números inteiros positivos.");
        } else {
            boolean resultado = verifica(numero);

            System.out.println("\nResultado:");
            if (resultado) {
                System.out.println("O número " + numero + " É um palíndromo.");
            } else {
                System.out.println("O número " + numero + " NÃO é um palíndromo.");
            }
        }

        scanner.close();
    }
}