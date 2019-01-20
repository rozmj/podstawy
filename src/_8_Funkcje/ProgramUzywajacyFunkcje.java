package _8_Funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramUzywajacyFunkcje {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);
        System.out.println("Podaj liczbę: ");
        double x = wejscie.nextDouble();
        double poleKwadratu = FunkcjeGeometryczne.poleKwadratu(x);
        System.out.println("Pole Kwadratu : " + poleKwadratu);
        double poleKola = FunkcjeGeometryczne.poleKola(x);
        System.out.println("Pole koła: " + poleKola);

        System.out.println("a teraz wylosuje sobie liczbę");
        double losowa = Math.random() * 100;
        System.out.println("Losowa " + losowa);
        double poleKwadratu2 = losowa * losowa;
        System.out.println("Pole Kwadratu : " + FunkcjeGeometryczne.poleKwadratu(losowa));
        double poleKola2 = Math.PI * losowa * losowa;
        System.out.println("Pole koła: " + FunkcjeGeometryczne.poleKola(losowa));


    }
}
