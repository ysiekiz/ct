import java.util.Scanner;

public class Dodawanie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe:");
        String input1 = input.nextLine();  // Read input as a string
        float l1 = Float.parseFloat(input1);  // Convert the string to a float

        System.out.println("Podaj druga liczbe:");
        String input2 = input.nextLine();  // Read input as a string
        float l2 = Float.parseFloat(input2);  // Convert the string to a float

        float w = l1 + l2;
        System.out.println("Wynik dodawania liczby " + l1 + " i " + l2 + " wynosi " + w);

        input.close();  // Close the Scanner
    }
}
