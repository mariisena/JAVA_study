import java.util.Scanner;

public class Codedex_EscapeRoom {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String question = """
            I speak without a mouth and hear without ears.
            I have no body, but I come alive with the wind.
            What am I?""";
        
        System.out.println(question);
        System.out.println("Answer: ");
        String answer = leitura.nextLine().toLowerCase();

        if (answer.equals("echo") || answer.equals("an echo")) {
            System.out.println("Correct! Congratulations, you solved the riddle! 🎉");         
        } else {
            System.out.println("Not quite! The correct answer was 'echo'. Better luck next time!");
        }

        leitura.close();
        }
    }
