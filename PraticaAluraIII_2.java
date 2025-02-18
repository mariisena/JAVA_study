import java.util.Scanner;

public class PraticaAluraIII_2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int primeiroNumero = leitura.nextInt();
        System.out.println("Digite outro número: ");
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro é maior!");
        } else if (primeiroNumero < segundoNumero) {
            System.err.println("O segundo é maior!");
        } else {
            System.out.println("Os números são iguais!");
        }
        
        leitura.close();
    }
}
