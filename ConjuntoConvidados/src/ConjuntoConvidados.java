import java.util.*;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<Convidado>();
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Gabriel", 1);
        conjuntoConvidados.adicionarConvidado("Leandro", 3);
        conjuntoConvidados.adicionarConvidado("Genia", 2);
        conjuntoConvidados.adicionarConvidado("Milena", 2);
        conjuntoConvidados.adicionarConvidado("Wanderson", 5);
        conjuntoConvidados.adicionarConvidado("Celia", 2);
        conjuntoConvidados.adicionarConvidado("Vilma", 7);
        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidado("7");

        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(String codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidados) {
            if (c.getCodigoConvite() == Integer.parseInt(codigoConvite)) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public Integer contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }
}
