import java.util.Scanner;

public class PraticaAluraIII_6 {
    public static void main(String[] args) {
        Scanner numeroScanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = numeroScanner.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        numeroScanner.close();
    }
}
