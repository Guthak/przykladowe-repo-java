import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {


        System.out.println("Podaj swoją wagę");
        Scanner waga = new Scanner(System.in);

        Float twojaWaga = waga.nextFloat();

        System.out.println("Podaj swój wzrost w cm");
        Scanner wzrost = new Scanner(System.in);

        int twojWzrost = wzrost.nextInt();

        float twojeBMI = 10000 * twojaWaga / (twojWzrost * twojWzrost);

        System.out.println("Twoje BMI wynosi " + twojeBMI);


        if (twojeBMI < 18.5) {
            System.out.println("Twoje BMI jest za małe");
        } else if (twojeBMI > 24.9) {
                System.out.println("Twoje BMI jest za duże");
            } else {
            System.out.println("Twoje BMI jest w normie");
        }




    }
}
