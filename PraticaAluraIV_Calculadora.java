import java.util.Scanner;

public class PraticaAluraIV_Calculadora {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner receberNumeroScanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = receberNumeroScanner.nextDouble();
        System.out.printf("Dobro do número recebido: %.2f", numero * numero);
    }
}

/*GABARITO
//Classe Calculadora
public class Calculadora {

    public int dobrarNumero(int numero) {
        return numero * 2;
    }
}

//Classe Principal
public class Principal {

    public static void main(String[] args) {
    
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);
    }
}
 */