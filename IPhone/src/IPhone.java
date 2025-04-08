public class IPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    private int versao = 1;
    private int anoFabricacao;
    private double preco;

    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();
        iPhone.setAnoFabricacao(2019);
        iPhone.setPreco(4500.00);
        iPhone.setVersao(7);
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.ligar("Laura");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        iPhone.selecionarMusica("Meu Novo Mundo");
        iPhone.tocar();
        iPhone.pausar();
        System.out.println(iPhone.toString());
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " selecionada");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligacao");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");

    }

    @Override
    public void ligar(String contato) {
        System.out.println("Ligando para " + contato);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");

    }

    @Override
    public String toString() {
        return "IPhone [versao=" + versao + ", anoFabricacao=" + anoFabricacao + ", preco=" + preco + "]";
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
