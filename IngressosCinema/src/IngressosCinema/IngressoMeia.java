package IngressosCinema;

public class IngressoMeia extends Ingresso {

    public IngressoMeia(double valor, String nomeFilme, boolean legendado) {
        super(valor, nomeFilme, legendado);
    }

    public double calcularValor() {
        return super.calcularValor() / 2;
    }
}
