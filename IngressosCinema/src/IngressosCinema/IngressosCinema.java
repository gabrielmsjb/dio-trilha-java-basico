package IngressosCinema;

public class IngressosCinema {
    public static void main(String[] args) throws Exception {
        // Criando um ingresso comum
        Ingresso ingressoComum = new Ingresso(20.0, "Filme A", true);
        System.out.println(
                "Ingresso comum: " + ingressoComum.getNomeFilme() + " - Valor: R$" + ingressoComum.calcularValor());

        // Criando um ingresso de meia entrada
        Ingresso ingressoMeiaEntrada = new IngressoMeia(20.0, "Filme A", true);
        System.out.println("Ingresso meia entrada: " + ingressoMeiaEntrada.getNomeFilme() + " - Valor: R$"
                + ingressoMeiaEntrada.calcularValor());

        // Criando um ingresso de família com 4 pessoas
        Ingresso ingressoFamilia = new IngressoFamilia(20.0, "Filme B", false, 4);
        System.out.println("Ingresso família: " + ingressoFamilia.getNomeFilme() + " - Valor: R$"
                + ingressoFamilia.calcularValor());
    }
}
