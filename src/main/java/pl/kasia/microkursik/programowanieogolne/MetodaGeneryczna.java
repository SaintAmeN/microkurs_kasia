package pl.kasia.microkursik.programowanieogolne;

import pl.kasia.microkursik.programowanieogolne.klasy.IZamykalny;

public class MetodaGeneryczna {
    // W tym przypadku T jest dowolnym typem który implementuje interfejs IOtwieralny.
    public static <T extends IZamykalny> String wypisz(T obiekt) {
        return String.valueOf(obiekt);
    }
}

//public class MetodaGeneryczna<T extends IZamykalny> {
//    // W tym przypadku T jest dowolnym typem który implementuje interfejs IOtwieralny.
//    public String wypisz(T obiekt) {
//        return String.valueOf(obiekt);
//    }
//}