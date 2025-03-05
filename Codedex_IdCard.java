public class Codedex_IdCard {
    public static void main(String[] args) {
        String name = "João Augusto";
        String state = "Minas Gerais";
        char gender = 'M';
        int age = 26;
        boolean organDonor = true;
        
        String title = """
* ██╗██████╗      ██████╗ █████╗ ██████╗ ██████╗ 
* ██║██╔══██╗    ██╔════╝██╔══██╗██╔══██╗██╔══██╗
* ██║██║  ██║    ██║     ███████║██████╔╝██║  ██║
* ██║██║  ██║    ██║     ██╔══██║██╔══██╗██║  ██║
* ██║██████╔╝    ╚██████╗██║  ██║██║  ██║██████╔╝
* ╚═╝╚═════╝      ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ 
                """;
            
                System.out.print(title);
                System.out.println("Name: " + name);
                System.out.println("Idade: " + age + " anos");
                System.out.println("Estado: " + state + " - Brasil");
                System.out.println("Gênero: " + gender);
                System.out.println("Doador de Órgãos: " + (organDonor ? "Sim" : "Não"));
    }
}
