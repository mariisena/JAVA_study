import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = dados.nextLine();

        System.out.println("Digite o tipo da conta (ex: Corrente, Poupança): ");
        String tipoConta = dados.nextLine();

        System.out.println("Digite seu saldo inicial: R$ ");
        double saldoInicial = dados.nextDouble();

        System.out.println();

        // Visualização dados clientes
        System.out.println("*************************");
        System.out.println("Dados iniciais do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: R$ " + saldoInicial);
        System.out.println("*************************");

        System.out.println();

        // Operações
        System.out.println("Operações:" );
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println("Digite a opção desejada: ");
        int opcao = dados.nextInt();

        if (opcao == 1) {
            System.out.println("O seu saldo é de: " + saldoInicial);
        } else if (opcao == 2) {
            System.out.println("Informe o valor a receber: ");
            double valorAReceber = dados.nextDouble();
            double saldoAtualizado = saldoInicial + valorAReceber;
            System.out.println("Saldo atualizado R$ " + saldoAtualizado);
        } else if (opcao == 3) {
            System.out.println("Informe o valor que deseja transferir: ");
            double valorTransferencia = dados.nextDouble();
            if (valorTransferencia > saldoInicial) {
                System.out.println("Não há saldo suficiente para fazer essa transferência.");
            } else {
                double transferencia = saldoInicial - valorTransferencia;
                System.out.println("Saldo atualizado R$ " + transferencia);
            }
        } else if (opcao == 4) {
            System.out.println("Encerrando aplicação");
        } else {
            System.out.println("Opção inválida!");
        }  
        dados.close();
    }
}
