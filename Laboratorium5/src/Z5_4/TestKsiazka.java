package Z5_4;

import java.util.ArrayList;

public class TestKsiazka {
    public static void main(String[] args) {
        ArrayList<Ksiazka> listaKsiazek = new ArrayList<>();
        listaKsiazek.add(new Ksiazka("Ala", "Ora", 300));
        listaKsiazek.add(new Ebook("Ma", "DFFF", 400, 200, "pdf"));
        listaKsiazek.add(new KsiazkaPapierowa("Z", "Warek", 200, 1832));


        listaKsiazek.sort((k1, k2) -> k1.getTytul().compareTo(k2.getTytul()));


        for (Ksiazka x : listaKsiazek) {
            System.out.println(x);
        }
    }
}
