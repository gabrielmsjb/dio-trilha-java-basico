import java.util.*;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<Convidado>();
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Gabriel", 1);
        conjuntoConvidados.adicionarConvidado("Leandro", 2);
        conjuntoConvidados.adicionarConvidado("Genia", 3);
        conjuntoConvidados.adicionarConvidado("Milena", 4);
        conjuntoConvidados.adicionarConvidado("Wanderson", 5);
        conjuntoConvidados.adicionarConvidado("Celia", 6);
        conjuntoConvidados.adicionarConvidado("Vilma", 7);
        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidado("7");
        conjuntoConvidados.removerConvidado("3");

        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(String codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidados) {
            if (c.getCodigoConvite() == Integer.parseInt(codigoConvite))
                convidadoParaRemover = c;
        }
        convidados.remove(convidadoParaRemover);
    }

    public Integer contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        for (Convidado c : convidados) {
            System.out.println(c.getNome());
        }
    }
}
