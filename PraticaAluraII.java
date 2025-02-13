import java.util.Random;
import java.util.Scanner;

public class PraticaAluraII {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = random.nextInt(100);
        int tentativas = 10;

        System.out.println("JOGO DE ADIVINHAÇÃO!!\nTente adivinhar o número entre 0 a 100.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + " de " + tentativas + ". Digite um número: ");

            if (leitura.hasNextInt()) {
                int palpite = leitura.nextInt();

                if (palpite == numeroAleatorio) {
                    System.out.println("PARABÉNS! Você acertou o número.");
                    break;
                } else if (palpite > numeroAleatorio) {
                    System.out.println("O número é menor!");
                } else {
                    System.out.println("O número é maior!");
                }

                if (i == tentativas) {
                    System.out.println("FIM DE JOGO!!\nO número era: " + numeroAleatorio);
                }
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                leitura.next();
                i--;
            }
        }

        leitura.close();
    }
}
