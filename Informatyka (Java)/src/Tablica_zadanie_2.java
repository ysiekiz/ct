import java.util.Random;
public class Tablica_zadanie_2 {
    public static void main(String[] args){
        Random r = new Random();
        int r1 = r.nextInt(0, 100);
        int reszta = 0;
        for (int i = 0; i <= 100; i++) {
            reszta = i % 2;
            if (reszta==0){
                System.out.println(i);
            }
        }
    }
}
