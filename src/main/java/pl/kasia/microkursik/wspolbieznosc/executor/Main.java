package pl.kasia.microkursik.wspolbieznosc.executor;

import pl.kasia.microkursik.wspolbieznosc.thread_runnable.Wykonywalna;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Executor pulaWatkow = Executors.newCachedThreadPool();
        pulaWatkow.execute(new Wykonywalna());
        pulaWatkow.execute(new Wykonywalna());
        pulaWatkow.execute(new Wykonywalna());
        pulaWatkow.execute(new Wykonywalna());
        pulaWatkow.execute(new Wykonywalna());
        pulaWatkow.execute(new Wykonywalna());
        pulaWatkow.execute(new Wykonywalna());
        pulaWatkow.execute(new Wykonywalna());
        pulaWatkow.execute(new Wykonywalna());
        pulaWatkow.execute(new Wykonywalna());
        pulaWatkow.execute(new Wykonywalna());
    }
}
