package pl.kasia.microkursik.strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2_konwersja_strumienia_na_kolekcje {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

//        Set<String> drugaLista = lista.stream()
//                .map(new Function<String, String>() {
//                    @Override
//                    public String apply(String dupa) {
//                        return dupa.toUpperCase();
//                    }
//                })
//                .collect(Collectors.toSet());

//        Set<String> drugaLista = lista.stream()
//                .map(dupa -> dupa.toUpperCase())
//                .collect(Collectors.toSet());

//        Set<String> drugaLista = lista.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toSet());



//                }).collect(Collectors.toList());
//                }).collect(Collectors.toMap(
//                        obiekt -> obiekt,
//                        obiekt -> obiekt
//                ));

    }
}
