package pl.kasia.microkursik.mock;

public interface Serwis {
    //    public boolean jestDostepny(){
//        return true;
//    }
//
//    public int getStanKonta(){
//        return 20;
//    }

    /**
     *
     * @return true jeśli dostępny, false jeśli nie.
     */
    public boolean jestDostepny();

    /**
     * @return stan konta.
     * @throws RuntimeException - rzuca exception jeśli się nie połączy.
     */
    public int getStanKonta() throws RuntimeException;
}
