package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.ArrayList;
import java.util.List;

public class Main7_ograniczona_liczba_wynikow {
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

        List<Obywatel> drugaLista = lista.stream()
                .sorted((o1, o2) -> Integer.compare(o2.getWiek(), o1.getWiek()))
                .limit(1) // szukamy tylko jednego wyniku
                .toList();

    }
}
