import java.util.Scanner;

public class PraticaAluraIV_Carro {
    String modelo;
    int ano;
    String cor;

    void fichaTecnica () {
        System.out.println("***************");
        System.out.println("FICHA TÉCNICA CARRO");
        System.out.println();
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade do carro: " + calcularIdadeCarro() + " anos");
        System.out.println("***************");
    }
    int calcularIdadeCarro() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - ano;
    }

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        PraticaAluraIV_Carro meuCarro = new PraticaAluraIV_Carro();

        System.out.println("Digite o modelo do carro: ");
        meuCarro.modelo = dados.nextLine();

        System.out.println("Digite o ano do carro: ");
        meuCarro.ano = dados.nextInt();
        dados.nextLine();

        System.out.println("Qual a cor do carro: ");
        meuCarro.cor = dados.nextLine();

        meuCarro.fichaTecnica();

        dados.close();
    }
}

/* GABARITO
 * //Classe Carro
public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade() {
        return 2023 - ano;
    }
}

//Classe Principal
public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Preto";

        // Exibir ficha técnica
        meuCarro.exibeFichaTecnica();

        // Calcular idade do carro
        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
    }
}
 */
