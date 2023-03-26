package pl.kasia.microkursik.strumienie;

import pl.kasia.microkursik.strumienie.klasy.Obywatel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main10_11_12_13_optional_tworzenie {
    public static void main(String[] args) {
        Optional<Double> wartosc = null;

    }

    public static Optional<String> metoda1(){
        String X = null;
        return Optional.of(X);          // Pudełko z wartością w środku (jeśli X jest null, to rzuci exception)
    }

    public static Optional<String> metoda2(){
        String X = null;
        return Optional.ofNullable(X); // Pudełko z wartością w środku (jeśli X jest null, zwróci empty)
    }
}
