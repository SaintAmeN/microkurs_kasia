package pl.kasia.microkursik.wspolbieznosc.blokada;

import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

public class Main {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        BlokowanyWatek blokowanyWatek = new BlokowanyWatek();
        new Thread(blokowanyWatek).start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        blokowanyWatek.getBarrier().await();
        System.out.println("Bariera obalona, kontynuuje");
    }
}
