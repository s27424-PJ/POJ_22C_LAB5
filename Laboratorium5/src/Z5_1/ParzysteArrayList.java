package Z5_1;
import java.util.ArrayList;
public class ParzysteArrayList {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        ArrayList<Integer> listaParzystych = new ArrayList<>(50);
        for (int i = 1; listaParzystych.size() < 50; i++) {
            if (i % 2 == 0) {
                listaParzystych.add(i);
            }
        }

        for (int i = 0; i < listaParzystych.size(); i++) {
            System.out.println("Liczba: " + listaParzystych.get(i) );
        }

        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println("Czas wykonania: " + elapsedTime + " nanosekund");


    }
}