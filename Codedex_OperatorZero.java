public class Codedex_OperatorZero {
    public static void main(String[] args) {
        double chemicalA = 15.6;
        double chemicalB = 0.56;

        double reactionResult = (chemicalA + chemicalB) / (chemicalA * chemicalB);

        System.out.printf("O resultado da reação é de %.3f", reactionResult);
    }
}
