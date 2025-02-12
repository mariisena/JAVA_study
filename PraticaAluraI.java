public class PraticaAluraI {
    public static void main(String[] args) {
        // 1. média de duas notas
        double nota1 = 7.5;
        double nota2 = 8.5;
        double media = (nota1 + nota2)/2;
        System.out.println("A media é de: " + media);

        // 2. casting de double para int
        double numeroDouble = 9.7;
        int numeroInt = (int) numeroDouble;
        System.out.println("Casting de double para int: " + numeroDouble + " convertido para int: " + numeroInt);

        // 3. concatenação de char e string
        char letra = 'M';
        String palavra = "aria";
        System.out.println("Nome formado: " + letra + palavra);

        // 4. valor do produto
        double precoProduto = 20;
        int quantidade = 15;
        double preco = precoProduto * quantidade;
        System.out.println("O preço do produto: " + preco);

        // 5. conversão do valor em dólares
        double precoEmDolares = 15.53;
        double umDolar = 4.94;
        double valorEmReais = precoEmDolares * umDolar;
        System.out.printf("O valor em dólar é: %.2f\n", valorEmReais);

        // 6. cálculo de desconto
        double precoOriginal = 25.50;
        double percentualDesconto = 10.0;
        double calculoDesconto = (precoOriginal * percentualDesconto) / 100;
        double novoPreco = precoOriginal - calculoDesconto;
        System.out.printf("O valor com desconto: R$ %.2f ", novoPreco);
    }
}
