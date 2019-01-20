package _7_petle;

import java.util.Scanner;

public class Parkomant {

    public static void main(String[] args) {
        System.out.println("Ile będziesz parkować ?");

        Scanner wejście = new Scanner(System.in);
        int godziny = wejście.nextInt();
        int kwota = godziny*3;

        System.out.println("Musisz zapłacić" + kwota);

        Scanner wejscie = new Scanner(System.in);
        int opłata = 0;
        while (opłata < kwota){
            System.out.println("Wrzuć monetę...");
            int wrzutka = wejscie.nextInt();
            opłata=opłata+wrzutka;


            System.out.println("udało się zebrać"+ opłata);
                        if (opłata<kwota)
                System.out.println("Do wydania");
        }
}
}
