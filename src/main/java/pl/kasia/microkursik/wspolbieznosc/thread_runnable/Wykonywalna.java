package pl.kasia.microkursik.wspolbieznosc.thread_runnable;

import lombok.Setter;

@Setter
// Run - biega
// ...able - odpalalne
public class Wykonywalna implements Runnable{
    private boolean czyZatrzymac = false;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello");

            if (czyZatrzymac) {
                break;
            }
        }
    }
}
