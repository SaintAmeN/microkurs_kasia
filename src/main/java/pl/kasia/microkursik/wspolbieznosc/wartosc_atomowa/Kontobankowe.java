package pl.kasia.microkursik.wspolbieznosc.wartosc_atomowa;

import java.util.concurrent.atomic.AtomicReference;

public class Kontobankowe {
    public AtomicReference<Double> stan = new AtomicReference<>(0.0);
}
