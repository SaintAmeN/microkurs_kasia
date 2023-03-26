package pl.kasia.microkursik.wspolbieznosc.synchronizacja;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Transakcja implements Runnable {
    private Kontobankowe kontobankowe;
    private int kwota;

    @Override
    public void run() {
        kontobankowe.zmienStanKonta(kwota);
    }
}
