package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main6_sortowanie {
    public static void main(String[] args) {
        List<Obywatel> lista = new ArrayList<>();
        lista.addAll(
                List.of(
                        new Obywatel("Jan", 23),
                        new Obywatel("Marian", 28),
                        new Obywatel("Miriam", 16),
                        new Obywatel("Oli", 36)
                )
        );
//
//        List<Obywatel> drugaLista = lista.stream()
//                .sorted((o1, o2) -> Integer.compare(o2.getWiek(), o1.getWiek()))
//                .toList();

        List<Obywatel> drugaLista = lista.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2.getImie(), o1.getImie()))
                .toList();

    }
}
