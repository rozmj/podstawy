package _2_typy_danych;

import java.time.LocalDate;

public class Szkolenie {

    double cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;
    Adres;


    //1. tworzenie nowego obiektu
    //budowa konstruktora jest to public/privet [nazwa][(lista parametrow)]
    //nazwa-nazwa taka sama jak nazwa klasy
    //konstruktor bezparametryczny
    public Szkolenie() {
        System.out.println("Wykonal sie konstruktor bezparametryczny");
    }
    // konstruktor parametryczny
    public Szkolenie (String nazwa, int liczbaUczestnikow, double cena, LocalDate data,Adres ){
        System.out.println("Wykonal sie konstruktor parametryczny");
        this.nazwa=nazwa;
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;
    }


    //2. wypisanie informacji o obiekcie
    //teorzenie metody
    //[public/privet] [typ_zwracany] [nazwa] [(lista_parametryczna)]

    public void wyswietl(){
        System.out.println("Nazwa Szkolenia "+ this.nazwa);
        System.out.printf("\t Cena Szkolenia: %.2f PLN\n", this.cena);
        System.out.println("\t Liczba uczestnikow "+ this.liczbaUczestnikow);
        System.out.println("Data Szkolenia "+ this.data);

    }



}
