package pl.kasia.microkursik.programowanieogolne;

import lombok.AllArgsConstructor;

/**
 * W środku klasy generycznej może być dowolny typ.
 * @param <T> - dowolny typ.
 */
@AllArgsConstructor
public class KlasaGeneryczna<T> {
    private T zawartosc;

    public T getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(T zawartosc) {
        this.zawartosc = zawartosc;
    }
}
