package _9_kalkulator;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class KalkulatorKonsolowy {

    public static void main(String[] args) {
        System.out.println("Podawaj kolejne działania w formie");
        System.out.println(" 12 + 15");
        System.out.println("Zakończ wpisując napis nie będący liczbą");
        System.out.println();

        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);

        while(true) {
            System.out.print("> ");
            try {
                double arg1 = wejscie.nextDouble();
                String operacja = wejscie.next();
                double arg2 = wejscie.nextDouble();
                double wynik = 0;

                if("+".equals(operacja)){
                    wynik=arg1 + arg2;
                    System.out.println("Wynik " + wynik);
                }

                if("-".equals(operacja)){
                    wynik=arg1 - arg2;
                    System.out.println("Wynik " + wynik);
                }


                if("*".equals(operacja)){
                    wynik=arg1 * arg2;
                    System.out.println("Wynik " + wynik);
                }

                if("/".equals(operacja)){
                    wynik=arg1 / arg2;
                    System.out.println("Wynik " + wynik);
                }






            } catch(Exception e) {
                break;
            }
        }
        System.out.println("Dziekujemy, papa");
    }
}

