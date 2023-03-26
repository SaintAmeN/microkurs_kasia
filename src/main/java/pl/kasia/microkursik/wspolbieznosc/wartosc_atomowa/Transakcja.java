package pl.kasia.microkursik.wspolbieznosc.wartosc_atomowa;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Transakcja implements Runnable {
    private Kontobankowe kontobankowe;
    private int kwota;

    @Override
    public void run() {
        kontobankowe.stan.getAndUpdate(stanKontaPrzed -> stanKontaPrzed + kwota);
    }
}
