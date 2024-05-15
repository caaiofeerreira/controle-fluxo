import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDigite o primeiro parâmetro:");
            int primeiroParametro = scanner.nextInt();

            System.out.println("Digite o segundo parâmentro:");
            int segundoParametro = scanner.nextInt();

            try {
                contar(primeiroParametro, segundoParametro);
                break;
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    static void contar(int primeiroParametro, int segundoParametro ) throws ParametrosInvalidosException {
        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = segundoParametro - primeiroParametro;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}