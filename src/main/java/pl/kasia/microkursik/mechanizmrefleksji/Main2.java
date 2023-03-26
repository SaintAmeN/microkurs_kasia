package pl.kasia.microkursik.mechanizmrefleksji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(Main2.class.getResourceAsStream("/plik.esej"));
        BufferedReader br = new BufferedReader(is);


        StringBuilder sb = new StringBuilder();
        String liniaWPliku;

        while ((liniaWPliku = br.readLine()) != null) {
            sb.append(liniaWPliku).append("\n");
        }

        String trescCalegoPliku = sb.toString();
        System.out.println(trescCalegoPliku);

        String wzor = "ma \\w+ gdzies[.]*";
        String wynik = trescCalegoPliku.replaceAll(wzor, "*** *** ****es");
        System.out.println(wynik);

        Pattern wzorRegex = Pattern.compile(wzor);
        Matcher matcher = wzorRegex.matcher(trescCalegoPliku);
        while (matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }
    }
}
