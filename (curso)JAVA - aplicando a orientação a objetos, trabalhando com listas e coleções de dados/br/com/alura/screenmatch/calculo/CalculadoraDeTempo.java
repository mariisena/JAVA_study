package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui (Titulo titulo){
        System.out.println("Adicionando duração em minutos: " + titulo);
        this.tempoTotal+= titulo.getDuracaoEmMinutos ();
        
    }
}