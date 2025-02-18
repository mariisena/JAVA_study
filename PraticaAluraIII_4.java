
import java.util.Scanner;

public class PraticaAluraIII_4 {
    public static void main(String[] args) {
        Scanner numeroAleatorio = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = numeroAleatorio.nextInt();

        System.out.println("Tabuado do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        numeroAleatorio.close();
    }
}
