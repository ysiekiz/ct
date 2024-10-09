import java.util.Scanner;

public class Petla_FOR_Bez_Warunka_Startkowego {
    public static void main(String[] args){
        int n = (new Scanner(System.in)).nextInt();
        int i = (new Scanner(System.in)).nextInt();
        for ( ; i <= n; i++){
            System.out.println(i);
            i++;
        }

    }
}
