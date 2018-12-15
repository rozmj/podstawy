package _2_typy_danych;

import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {

    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie("Szkolenie Java",10,1000,LocalDate.of(2018,Month.DECEMBER,15));



        szkolenieJava.nazwa="Szkolenie Java";
        szkolenieJava.cena = 1000;
        szkolenieJava.liczbaUczestnikow = 10;
        szkolenieJava.data = LocalDate.of(2018, Month.DECEMBER,15);

        System.out.println("Nazwa Szkolenia "+ szkolenieJava.nazwa);
        System.out.printf("\t Cena Szkolenia: %.2f PLN\n", szkolenieJava.cena);
        System.out.println("\t Liczba uczestnikow "+ szkolenieJava.liczbaUczestnikow);
        System.out.println("Data Szkolenia "+ szkolenieJava.data);
        System.out.println();

        Szkolenie szkoleniePython = new Szkolenie();

        szkoleniePython.nazwa = "Szkolenie Python";
        szkoleniePython.cena = 2000;
        szkoleniePython.liczbaUczestnikow = 12;
        szkoleniePython.data = LocalDate.of(2019, Month.DECEMBER,23);

        System.out.println("Nazwa Szkolenia "+ szkoleniePython.nazwa);
        System.out.println("\t Cena Szkolenia "+ szkoleniePython.cena);
        System.out.println("\t Liczba uczestnikow "+ szkoleniePython.liczbaUczestnikow);
        System.out.println("Data Szkolenia "+ szkoleniePython.data);
    }
}
