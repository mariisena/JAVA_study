class Animal {
    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau Miau!");
    }

    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis.");
    }
}

public class PraticaAluraVI_Animal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();
    }
}