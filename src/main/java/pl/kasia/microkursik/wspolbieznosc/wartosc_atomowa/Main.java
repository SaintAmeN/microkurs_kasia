package pl.kasia.microkursik.wspolbieznosc.wartosc_atomowa;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Executor pula = Executors.newCachedThreadPool();

        Kontobankowe kontobankowe = new Kontobankowe();
        for (int i = 0; i < 1000; i++) {
            pula.execute(new Transakcja(kontobankowe, 100));
        }

        // wynik oczekiwany = 100 000
        Thread.sleep(5000);
        System.out.println(kontobankowe.stan);
    }
}
