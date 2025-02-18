
import java.util.Scanner;

public class PraticaAluraIII_5 {
    public static void main(String[] args) {
        Scanner numeroScanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = numeroScanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }

        numeroScanner.close();
    }

}