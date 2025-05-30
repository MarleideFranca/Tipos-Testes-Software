import java.util.Scanner;

public class Cliente {
    public static String categoria(int idade) {
        if (idade < 0 || idade > 120) {
            return "Idade inválida";
        } else if (idade <= 12) {
            return "Criança";
        } else if (idade <= 17) {
            return "Adolescente";
        } else if (idade <= 64) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        String resultado = categoria(idade);
        System.out.println("Categoria: " + resultado);

        scanner.close();
    }
}


