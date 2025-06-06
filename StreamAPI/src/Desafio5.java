import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Desafio5 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaioresQueCinco = numeros.stream().filter(n -> n > 5).collect(Collectors.toList());

        OptionalDouble media = numerosMaioresQueCinco.stream().mapToDouble(Integer::intValue).average();

        System.out.println(media);
    }

}
