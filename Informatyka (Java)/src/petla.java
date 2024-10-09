import java.util.Random;
import java.util.Scanner;

public class petla {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int X = s.nextInt();
        int W = 0;
        //int r1 = s.nextInt();
        //int r2 = s.nextInt();
        int i = 0;
        while (i < 30){
            i++;
            int los = r.nextInt(0, 100);
            System.out.println(los);
            if (X < los){
                W++;
            }


        }
    System.out.println("Wiekszych od" +X+ " Jest " +W );

    }
}


