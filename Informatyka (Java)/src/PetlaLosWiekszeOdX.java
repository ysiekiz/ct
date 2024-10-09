import java.util.Random;
import java.util.Scanner;

public class PetlaLosWiekszeOdX {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int X = s.nextInt();
        int Wieksze_od_X = 0 ;
        int i = 0;
        while (i < 30){
            i++;
            int los = r.nextInt(0, 100);
            System.out.println(los);
            if (X < los){
                Wieksze_od_X++;
            }


        }
        System.out.println("Wiekszych od" +X+ " Jest " +Wieksze_od_X);

    }
}


