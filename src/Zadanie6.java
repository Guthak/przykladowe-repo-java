import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        float sum = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum + 1 / (float) i;
        }

        System.out.println(sum);


    }
}


