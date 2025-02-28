public class PraticaAluraV_IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade.");
        }
}
}

class PrincipalUm {
    public static void main(String[] args) {
        PraticaAluraV_IdadePessoa pessoa1 = new PraticaAluraV_IdadePessoa();
        pessoa1.setNome("Douglas");
        pessoa1.setIdade(18);

        PraticaAluraV_IdadePessoa pessoa2 = new PraticaAluraV_IdadePessoa();
        pessoa2.setNome("Samara");
        pessoa2.setIdade(26);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();
    }
}
