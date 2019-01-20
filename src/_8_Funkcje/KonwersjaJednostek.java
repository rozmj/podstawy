package _8_Funkcje;


public class KonwersjaJednostek {

    public static final double MILA = 1.61;

    public static double MileNaKilometry(double a) {
        return a* MILA;
    }

    public static double KilometryNaMile(double b) {
        return b*0.62137;
    }

    public static double FarNaCel (double c) {
        return (c-32)/1.8000;
    }

    public static  double CelNaFar (double e) {
        return (e*9)/5+32;
    }


}