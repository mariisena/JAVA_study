
import java.util.Scanner;

public class PraticaAluraIV_Aluno {
    String nomeAluno;
    int idadeAluno;

    void exibirInformacoes () {
        System.out.println("********************");
        System.out.println("Informações do Aluno");
        System.out.println("********************");
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Idade: " + idadeAluno + " anos");
        System.out.println();
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        PraticaAluraIV_Aluno meuAluno = new PraticaAluraIV_Aluno();

        System.out.println("Digite o nome do aluno: ");
        meuAluno.nomeAluno = leitura.nextLine();

        System.out.println("Digite a idade do aluno: ");
        meuAluno.idadeAluno = leitura.nextInt();

        meuAluno.exibirInformacoes();

        leitura.close();
    }

}

/* GABARITO
 * //Classe Aluno
public class Aluno {
    String nome;
    int idade;

    void exibeInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }
}

//Classe Principal
public class Principal {
    public static void main(String[] args) {
        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Akemi";
        meuAluno.idade = 18;

        meuAluno.exibeInformacoes();
    }
}
 */