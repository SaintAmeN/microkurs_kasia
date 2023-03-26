package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main10_11_12_13_optional_or_else_throw {
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

        Obywatel najmlodszy = lista1.stream()
                .sorted((o1, o2) -> Integer.compare(o2.getWiek(), o1.getWiek()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("uga buga nie działa"));

        System.out.println("Jest");
    }
}
