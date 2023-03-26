package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.*;
import java.util.stream.Collectors;

public class Main8_laczenie_strumieni {
    public static void main(String[] args) {
        List<Obywatel> lista1 = new ArrayList<>();
        lista1.addAll(
                List.of(
                        new Obywatel("Jan", 23),
                        new Obywatel("Marian", 28),
                        new Obywatel("Miriam", 16),
                        new Obywatel("Oli", 36)
                )
        );

        Set<Obywatel> set1 = new HashSet<>();
        set1.addAll(
                List.of(
                        new Obywatel("Kamil", 43),
                        new Obywatel("Floarian", 13),
                        new Obywatel("Euzebiusz", 83),
                        new Obywatel("Ola", 25)
                )
        );

        List<Collection<Obywatel>> listaList = new ArrayList<>(List.of(lista1, set1));
//        listaList.add(lista1);
//        listaList.add(set1);

//        List<Obywatel> listaWszystkichObywateli = listaList.stream()
//                .flatMap(listaNaLiscie -> listaNaLiscie.stream())
//                .toList();

        List<Obywatel> listaWszystkichObywateli = listaList.stream()
                .flatMap(Collection::stream)
                .toList();
    }
}
