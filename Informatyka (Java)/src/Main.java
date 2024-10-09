import java.util.Random;

public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        int los1 = rand.nextInt(-10, 10);
        int los2 = rand.nextInt(-10, 10);
        int los3 = rand.nextInt(-10, 10);

        System.out.println("los 1 rowny " + los1 + " los 2 rowny " + los2 + " los 3 rowny " + los3);
        if (los1>los2 && los1>los3){
            System.out.println("Los 1 jest najwiekszy");
        }
        else if (los2>los1 && los2>los1){
            System.out.println("Los 2 jest najwiekszy");
        }
        else if (los3>los1 && los3>los2){
            System.out.println("Los 3 jest najwiekszy");
        }
        if (los1<los2 && los1<los3){
            System.out.println("Los 1 jest najmniejszy");
        }
        else if (los2<los1 && los2<los3){
            System.out.println("Los 2 jest najmniejszy");
        }
        else if (los3<los1 && los3<los2){
            System.out.println("Los 1 jest najmniejszy");
        }





//
//        System.out.println("Los 1 jest rowny " + los1 + "   Los 2 jest rowny " + los2);
//        if (los1>los2){
//            System.out.println("Los 1 jest wiekszy od los 2");
//        }
//        else if (los1<los2){
//            System.out.println("Los 2 jest wiekszy od losu 1");
//        }
//        else if (los1 == los2){
//            System.out.println("Los 1 i los 2 sa rowne");
//
//        }


    }
}