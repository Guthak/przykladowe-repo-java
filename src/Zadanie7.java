import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę do wzoru");

        Scanner scanner = new Scanner(System.in);
        int fibonacci = scanner.nextInt();
        int a = 1;
        int b = 1;


        int i = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        while (i <= fibonacci - 2) {

            int sum = a + b;
            a = b;
            b = sum;
            i++;

            System.out.print(sum + " ");
        }
// czemu nie daje mi pierwszej liczby

    }
}



