
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("Gabriela", 27));
        listaDePessoas.add(new Pessoa("Douglas", 19));
        listaDePessoas.add(new Pessoa("Marco Antônio", 8));

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        
        System.out.println("Lista de Pessoas:");
            for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }

}
