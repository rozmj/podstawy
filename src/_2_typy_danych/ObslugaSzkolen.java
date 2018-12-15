package _2_typy_danych;

import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {

    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie("Szkolenie Java", 10, 1000, LocalDate.of(2018, Month.DECEMBER, 15));

        szkolenieJava.wyswietl();

        Szkolenie szkoleniePython = new Szkolenie("Szkolenie Python", 12, 2000, LocalDate.of(2019, Month.DECEMBER, 12));

        szkoleniePython.wyswietl();
    }
}