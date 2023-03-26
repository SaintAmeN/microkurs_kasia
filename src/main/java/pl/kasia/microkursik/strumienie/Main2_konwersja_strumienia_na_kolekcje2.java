package pl.kasia.microkursik.strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2_konwersja_strumienia_na_kolekcje2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.addAll(List.of("1", "233", "5345", "123"));

        String wartosc = "123.5";
        int liczbaInt = Integer.parseInt(wartosc);
        double liczba = Double.parseDouble(wartosc);

//        Set<Double> drugaLista = lista.stream()
//                .map(new Function<String, Double>() {
//                    @Override
//                    public Double apply(String dupa) {
//                        return Double.parseDouble(dupa);
//                    }
//                })
//                .collect(Collectors.toSet());

//        Set<Double> drugaLista = lista.stream()
//                .map(dupa -> Double.parseDouble(dupa))
//                .collect(Collectors.toSet());

        Set<Double> drugaLista = lista.stream()
                .map(Double::parseDouble)
                .collect(Collectors.toSet());

    }
}
