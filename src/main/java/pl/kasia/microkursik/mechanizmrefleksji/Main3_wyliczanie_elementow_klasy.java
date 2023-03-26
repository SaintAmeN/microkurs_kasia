package pl.kasia.microkursik.mechanizmrefleksji;

import pl.kasia.microkursik.mechanizmrefleksji.klasy.Drzwi;
import pl.kasia.microkursik.mechanizmrefleksji.klasy.Obywatel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3_wyliczanie_elementow_klasy {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        for (Method method : Drzwi.class.getMethods()) {
            System.out.println(method.getName());
//            System.out.println(method.getModifiers());
//            System.out.println(method.getReturnType());
        }

//        Drzwi drzwi = new Drzwi();
//        drzwi.

        System.out.println();
        System.out.println();
        System.out.println();

        Obywatel obywatel = new Obywatel("jan", 20);
        for (Field pole : Obywatel.class.getDeclaredFields()) {
            System.out.println(pole.getName());
            pole.setAccessible(true);

            if (pole.getName().equals("wiek")) {
                pole.setInt(obywatel, 10);
            }
        }

        System.out.println(obywatel);
    }
}
