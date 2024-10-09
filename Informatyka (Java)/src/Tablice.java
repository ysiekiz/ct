import java.util.Scanner;

public class Tablice {
    public static void main(String[] args){
    int a = 10;
    int [] tablica = new int [10];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < tablica.length;i++ ){
        tablica[i] = s.nextInt();
    }
    int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
            //suma += tablica[i] skrocone dodawanie
        }


    }
}
