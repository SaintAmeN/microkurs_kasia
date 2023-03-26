package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.*;

public class Main10_11_12_13_optional {
    public static void main(String[] args) {
        List<Obywatel> lista1 = new ArrayList<>();
        lista1.addAll(
                List.of(
//                        new Obywatel("Jan", 23),
//                        new Obywatel("Marian", 28),
//                        new Obywatel("Miriam", 16),
//                        new Obywatel("Oli", 36)
                )
        );

        Optional<Obywatel> najmlodszy = lista1.stream()
                .sorted((o1, o2) -> Integer.compare(o2.getWiek(), o1.getWiek()))
                .findFirst();

        if (najmlodszy.isPresent()) {
            System.out.println("Jest");
        }

        if (najmlodszy.isEmpty()) {
            System.out.println("nie ma");
        }
    }
}
