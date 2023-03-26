package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.ArrayList;
import java.util.List;

public class Main6_modyfikacja_danych_w_locie {
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

        // Chcę unikalne imiona osób które są starsze niż 20 lat
        List<String> drugaLista = lista.stream()
                .filter(obywatel -> obywatel.getWiek() > 20)
                .distinct() // usun duplikaty
                .map(obywatel -> obywatel.getImie()) // zamieniam jeden typ na drugi w locie
                .toList();
    }
}
