import java.io.Console;
import java.util.Scanner;

public class Euklides {


    public static void main(String[] args) {
//        int a = 15;
//        int b = 10;

        System.out.println("Podaj a.");
        Scanner scannerA = new Scanner(System.in);
        int a = scannerA.nextInt();
        System.out.println("Podaj b.");
        Scanner scannerB = new Scanner(System.in);
        int b = scannerB.nextInt();

        while (a != b){
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        System.out.println("Największy wspólny dzielnik (NWD) to: "+ a);
    }


}
