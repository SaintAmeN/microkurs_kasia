package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main4_filtrowanie_kolekcji_typy_zlozone {
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

        Set<Obywatel> drugaLista = lista.stream()
                .filter(obywatel -> obywatel.getWiek() > 30)
                .collect(Collectors.toSet());

    }
}
