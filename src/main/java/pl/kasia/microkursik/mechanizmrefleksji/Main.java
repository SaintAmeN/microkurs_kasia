package pl.kasia.microkursik.mechanizmrefleksji;

import java.io.*;
import java.net.URL;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(Main.class.getResourceAsStream("/plik.properties"));
        Properties properties = new Properties();
        properties.load(is);

        System.out.println(properties);
    }
}
