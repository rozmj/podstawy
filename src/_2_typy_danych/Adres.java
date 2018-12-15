package _2_typy_danych;

public class Adres {
    String ulica;
    String miasto;
    String kodpocztowy;


    //1. tworzenie nowego obiektu
    //budowa konstruktora jest to public/privet [nazwa][(lista parametrow)]
    //nazwa-nazwa taka sama jak nazwa klasy
    //konstruktor bezparametryczny
    public Adres() {
        System.out.println("Wykonal sie konstruktor bezparametryczny");
    }

    // konstruktor parametryczny
    public Adres(String ulica, String miasto, String kodpocztowy) {
        System.out.println("Wykonal sie konstruktor parametryczny");
        this.ulica = ulica;
        this.miasto = miasto;
        this.kodpocztowy = kodpocztowy;

    }


    //2. wypisanie informacji o obiekcie
    //teorzenie metody
    //[public/privet] [typ_zwracany] [nazwa] [(lista_parametryczna)]

    public void wyswietl() {
        System.out.println("ulica " + this.ulica);
        System.out.println("\t miasto" + this.miasto);
        System.out.println("\t kodpocztowy " + this.kodpocztowy);

    }
}