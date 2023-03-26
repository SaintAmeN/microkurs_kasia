package pl.kasia.microkursik.wspolbieznosc.blokada;

import lombok.Getter;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@Getter
public class BlokowanyWatek implements Runnable{
    private CyclicBarrier barrier = new CyclicBarrier(2);

    @Override
    public void run() {
        try {
            System.out.println("Startuję. Czekam na zwolnienie bariery.");
            barrier.await();

            System.out.println("Zwolniona bariera");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
