package pl.kasia.microkursik.strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main6_sortowanie_prymitywne {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(1, 233, 5345, 123));

        List<Integer> drugaLista = lista.stream()
                .sorted() // sortuje rosnąco
                .toList();
    }
}
