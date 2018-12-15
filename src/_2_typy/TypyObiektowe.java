package _2_typy;

import java.util.Scanner;

public class TypyObiektowe {

    public static void main(String[] args) {

        System.out.print("Podaj imie : ");

        Scanner wejscie = new Scanner(System.in);

        String imie = wejscie.nextLine();

        int iloscZnakow = imie.length();

        System.out.println("Slowo " + imie + " ma "
                + iloscZnakow + " znakow ");

        if (iloscZnakow < 6) {
            System.out.println("Krotkie slowo");
        } else {
            System.out.println("Dlugie slowo");
        }

        boolean czyKonczysieNaA = imie.toLowerCase().endsWith("a");

        if (czyKonczysieNaA == false || imie.equalsIgnoreCase("Kuba")) {
            System.out.println("meskie");
        } else {
            System.out.println("damskie");
        }


    }
}
