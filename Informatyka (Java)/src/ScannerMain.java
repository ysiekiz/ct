//13.09.2024
import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int l1 = klawiatura.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int l2 = klawiatura.nextInt();

        if (l1 < l2)
            System.out.println("Los 1 jest najmniejszy");
        else if (l2 < l1)
            System.out.println("Los 2 jest najmniejszy");


    }
}
