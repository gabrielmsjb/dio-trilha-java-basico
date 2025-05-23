import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream().filter(Desafio14::ehPrimo).max(Integer::compareTo);

        System.out.println(maiorPrimo);
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
}
