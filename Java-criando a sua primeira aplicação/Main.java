public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screem Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Nota do filme: " + notaDoFilme);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = """
                Filme de aventura com galã do anos 80"
                Muito bom!!
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println("Classificação: " + classificacao + " estrelas");

    }
}
