package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.ArrayList;
import java.util.List;

public class Main17_match {
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

        boolean czyJestKtosZWiekiemWiekszymNiz30Lat = lista.stream()
                .anyMatch(obywatel -> obywatel.getWiek() > 30);

        boolean czyWszyscyMajaWiecejNiz30Lat = lista.stream()
                .allMatch(obywatel -> obywatel.getWiek() > 30);

        boolean czyNiktNieMaWiecejNiz30Lat = lista.stream().parallel()
                .noneMatch(obywatel -> obywatel.getWiek() > 30);
    }
}
