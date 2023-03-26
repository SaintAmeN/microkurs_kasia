package pl.kasia.microkursik.strumienie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main3_filtrowanie_kolekcji {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.addAll(List.of("1", "233", "5345", "123"));

        Set<Double> drugaLista = lista.stream()
                .map(dupa -> Double.parseDouble(dupa))
                .filter(dlaKazdegoElementuTegoStreamu -> dlaKazdegoElementuTegoStreamu > 100)
                .collect(Collectors.toSet());
    }
}
