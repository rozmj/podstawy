package _8_Funkcje;

public class TestowanieFunkcji {
    public static void main(String[] args) {
        double[] liczby = {0, 5, 1.5, -1, 10};
        for(double liczba : liczby){
            double kwadrat = FunkcjeGeometryczne.poleKwadratu(liczba);
            double kolo = FunkcjeGeometryczne.poleKola(liczba);
            System.out.println("Dla Liczby " + liczba + "pole kwadratu wynosi " + kolo);
        }

    }
}
