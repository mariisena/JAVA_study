public class Temperatura {
    public static void main(String[] args) {
        int temperaturaCelsius = 30;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %dºC é equivalente a %.2fºF", temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensagem);
    }
    
}
