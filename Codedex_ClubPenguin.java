
import java.util.Scanner;

public class Codedex_ClubPenguin {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {        
        double coinValue = 0.0045;

        Scanner coiScanner = new Scanner(System.in);
        System.out.println("Quantidade de moedas: ");
        double coins = coiScanner.nextDouble();

        double money = coinValue * coins;

        System.out.println("O valor total em dinheiro é: $ " + money);

        coiScanner.close();
    }
}
