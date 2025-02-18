import java.util.Scanner;

public class PraticaAluraIII_1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = leitura.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número negativo!");
        }

        leitura.close();
        
    }
}
