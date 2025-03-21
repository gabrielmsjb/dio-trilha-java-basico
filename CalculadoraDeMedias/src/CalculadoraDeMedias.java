import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calcularMediaTurma(alunos, scan);

        System.out.printf("Média da turma: %f", media);
    }

    public static double calcularMediaTurma(String[] alunos, Scanner scanner) {

        double soma = 0d;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno: %s", aluno);
            double nota;
            while (true) {
            try {
                nota = scanner.nextDouble();
                soma += nota;
                break;
                }
            catch (InputMismatchException e) {
                System.out.println("Voce deve digitar um numero");
                scanner.nextLine();
                }
            }
        }

        return soma / alunos.length;
    }
}