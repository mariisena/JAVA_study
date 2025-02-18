
import java.util.Scanner;

public class PraticaAluraIII_3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha a opção que gostaria de calcular:");
        System.out.println("(1) Calcular área do quadrado");
        System.out.println("(2) Calcular área do círculo");
        System.out.println("Opção: ");

        int opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o lado do quadrado: ");
            double ladoQuadrado = leitura.nextDouble();
            double areaQuadrado = ladoQuadrado * ladoQuadrado;
            System.out.println("A área do quadrado é: " + areaQuadrado);
        } else if (opcao == 2) {
            System.out.print("Digite o raio do círculo: ");
            double raio = leitura.nextDouble();
            double areaQuadrado = Math.PI * (raio * raio);
            System.out.printf("A área do círculo é: %.2f", areaQuadrado);
        } else {
            System.out.println("Opcão inexistente!");
        }
        leitura.close();
    }
}
