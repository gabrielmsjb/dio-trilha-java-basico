package IngressosCinema;

public class IngressoFamilia extends Ingresso {

    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean legendado, int numeroPessoas) {
        super(valor, nomeFilme, legendado);
        this.numeroPessoas = numeroPessoas;
    }

    public double calcularValor() {
        double valorTotal = super.getValor() * numeroPessoas;
        if (numeroPessoas > 3)
            valorTotal *= 0.95;
        return valorTotal;
    }
}
