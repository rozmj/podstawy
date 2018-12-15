package _2_typy_danych;

import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {

    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie("Szkolenie Java", 10, 1000, LocalDate.of(2018, Month.DECEMBER, 15));
        Adres AdresSzkoleniajava = new Adres("Lesna", "Dabrowa Gornicza", "41-300");


        szkolenieJava.wyswietl();
        AdresSzkoleniajava.wyswietl();

        Szkolenie szkoleniePython = new Szkolenie("Szkolenie Python", 12, 2000, LocalDate.of(2019, Month.DECEMBER, 12) );
        Adres AdresSzkoeleniaPython = new Adres ("Mariacka","Katowice","41-500");
        szkoleniePython.wyswietl();
        AdresSzkoeleniaPython.wyswietl();
    }
}