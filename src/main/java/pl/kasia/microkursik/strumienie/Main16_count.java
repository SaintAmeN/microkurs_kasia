package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.ArrayList;
import java.util.List;

public class Main16_count {
    public static void main(String[] args) {
        List<Obywatel> lista = new ArrayList<>();
        lista.addAll(
                List.of(
                        new Obywatel("Jan", 23),
                        new Obywatel("Jan", 23),
                        new Obywatel("Marian", 28),
                        new Obywatel("Marian", 28),
                        new Obywatel("Marian", 28),
                        new Obywatel("Marian", 28),
                        new Obywatel("Marian", 28),
                        new Obywatel("Marian", 28),
                        new Obywatel("Miriam", 16),
                        new Obywatel("Miriam", 16),
                        new Obywatel("Oli", 36)
                )
        );

        Long iloscWynikow = lista.stream()
                .filter(obywatel -> obywatel.getWiek() > 20)
                .count();
    }
}
