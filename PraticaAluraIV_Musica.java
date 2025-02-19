
import java.util.Scanner;

public class PraticaAluraIV_Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacaoTotal = 0;
    int numAvaliacoes = 0;

    void exibirFichaTecnica () {
        System.out.println("***************");
        System.out.println("*FICHA TÉCNICA*");
        System.out.println("***************");
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + mediaDeAvaliacao());
    }
    void avaliarMusica(double nota) {
        avaliacaoTotal += nota;
        numAvaliacoes++;
    }

    double mediaDeAvaliacao () {
        if (numAvaliacoes == 0) {
            return 0;
        }
        return avaliacaoTotal / numAvaliacoes;
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        PraticaAluraIV_Musica minhaMusica = new PraticaAluraIV_Musica();

        System.out.println("Digite o nome da música: ");
        minhaMusica.titulo = leitura.nextLine();

        System.out.println("Digite o nome do artista: ");
        minhaMusica.artista = leitura.nextLine();

        System.out.println("Digite ano de lançamento: ");
        minhaMusica.anoLancamento = leitura.nextInt();

        System.out.println("Digite uma nota para a música (0 a 5): ");
        double nota = leitura.nextDouble();
        minhaMusica.avaliarMusica(nota);

        minhaMusica.exibirFichaTecnica();

        leitura.close();
    }
}

/*GABARITO
 * //Classe Musica
public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }
}

//Classe Principal
public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Nome da Música";
        minhaMusica.artista = "Nome do Artista";
        minhaMusica.anoLancamento = 2023;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}
 */