package pl.kasia.microkursik.wspolbieznosc.thread_runnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Wykonywalna w = new Wykonywalna();

        Thread wątek = new Thread(w);
        wątek.start(); // wystartuj wątek, wątek wystartuje metodę run()

        Thread.sleep(15000);
        w.setCzyZatrzymac(true);
    }
}
