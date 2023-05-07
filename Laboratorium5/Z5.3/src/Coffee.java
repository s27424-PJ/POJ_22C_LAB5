import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {
    public static void main(String[] args) {
        ArrayList<String> kawy = new ArrayList<String>();

        kawy.add("espresso");
        kawy.add("latte");
        kawy.add("cappuccino");
        kawy.add("mocha");
        kawy.add("auLait");
        kawy.add("macchiato");


        System.out.println(kawy);


        Iterator<String> it = kawy.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String kawa : kawy) {
            System.out.println(kawa.toUpperCase());
        }


        for (String kawa : kawy) {
            System.out.println(kawa.substring(0, 4));
        }
    }
}
