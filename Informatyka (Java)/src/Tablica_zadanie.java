import java.util.Random;
//wypelnij tablice losowymi liczbami i wypisz
public class Tablica_zadanie {
    public static void main(String[] args){
        Random r = new Random();

        int [] tablica_random = new int[10];

        for (int i = 0; i < tablica_random.length; i++) {
            int r1 = r.nextInt(0, 100);
        tablica_random[i] = r1;
        }

        for (int i = 0; i < tablica_random.length; i++) {
            System.out.println("|" + tablica_random[i]);
        }
        }
    }

