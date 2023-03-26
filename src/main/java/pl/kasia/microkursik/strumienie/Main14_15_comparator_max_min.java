package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main14_15_comparator_max_min {
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

        List<Obywatel> wynik1 = lista.stream()
                .sorted((o1, o2) -> Integer.compare(o2.getWiek(), o1.getWiek()))
                .limit(1)
                .toList();

        Optional<Obywatel> wynik2 = lista.stream()
                .sorted((o1, o2) -> Integer.compare(o2.getWiek(), o1.getWiek()))
                .findFirst(); // znajdz pierwszy wynik (a jeśli go nie ma to mamy Optional.empty)

        Optional<Obywatel> wynik3 = lista.stream()
                .max((o1, o2) -> Integer.compare(o2.getWiek(), o1.getWiek()));
                // znajdz maksymalny wynik (a jeśli go nie ma to mamy Optional.empty)

        Optional<Obywatel> wynik4 = lista.stream()
                .min((o1, o2) -> Integer.compare(o2.getWiek(), o1.getWiek()));
                // znajdz minimalny wynik (a jeśli go nie ma to mamy Optional.empty)

    }
}
