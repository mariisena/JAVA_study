public class Perfil {
    public static void main(String[] args) {
        System.out.println("Olá, [Seu Nome]!");
        System.out.println("Tudo bem?");

        Estudos.main(args);
        Soma.main(args);
        Subtracao.main(args);
    }
}

class Estudos {
    public static void main(String[] args) {
        System.out.println("Anotações de estudos:");
        System.out.println("- JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode");
        System.out.println("- JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu programa;");
        System.out.println("- JDK (Java Development Kit) - Kit de Desenvolvimento Java responsável por compilar código-fonte em bytecode.");
    }
}

class Soma {
    public static void main(String[] args) {
        int resultado = 10 + 5;
        System.out.println(resultado);
    }
}

class Subtracao {
    public static void main(String[] args) {
        int resultado = 10 - 5;
        System.out.println(resultado);
    }
}