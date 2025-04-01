package IngressosCinema;

public class Ingresso {
    protected final double valor;
    protected final String nomeFilme;
    protected final boolean legendado;

    public Ingresso(double valor, String nomeFilme, boolean legendado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.legendado = legendado;
    }

    public double getValor() {
        return valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isLegendado() {
        return legendado;
    }

    public double calcularValor() {
        return valor;
    }
}
