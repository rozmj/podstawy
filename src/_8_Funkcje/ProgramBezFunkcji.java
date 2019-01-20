package _8_Funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBezFunkcji {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);
        System.out.println("Podaj liczbę: ");
        double x = wejscie.nextDouble();
        double poleKwadratu = x * x;
        System.out.println("Pole Kwadratu : " + poleKwadratu);
        double poleKola = Math.PI * x * x;
        System.out.println("Pole koła: " + poleKola);

        System.out.println("a teraz wylosuje sobie liczbę");
        double losowa = Math.random() * 100;
        System.out.println("Losowa " + losowa);
        double poleKwadratu2 = losowa * losowa;
        System.out.println("Pole Kwadratu : " + poleKwadratu2);
        double poleKola2 = Math.PI * losowa * losowa;
        System.out.println("Pole koła: " + poleKola2);


    }
}
