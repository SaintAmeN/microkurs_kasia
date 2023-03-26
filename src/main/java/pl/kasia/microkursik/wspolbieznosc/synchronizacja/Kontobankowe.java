package pl.kasia.microkursik.wspolbieznosc.synchronizacja;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicReference;

@Getter
public class Kontobankowe {
    private double stanKonta;

    public void zmienStanKonta(double kwota) {
        synchronized (this) {
            stanKonta = stanKonta + kwota;
        }
    }
}
