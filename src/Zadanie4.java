import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę całkowitą dodatnią do której ma wykonać się program");

        Scanner userNumber = new Scanner(System.in);
        int number = userNumber.nextInt();

        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 7 == 0))
                System.out.println("Pif paf");
            if (i % 3 == 0)
                System.out.println("Pif");
            else if (i % 7 == 0)
                System.out.println("Paf");
            else {
                System.out.println(i);
            }

        }


    }
}
