import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {

        //System.out.println("Podaj liczbę");

       //Scanner scanner = new Scanner(System.in);




    }

static void printPrimes(int n) {
        for (int i = 2; i < n; i++) {
            if(isPrime(i)) {
                System.out.println(i + ", ");
            }
        }
}



    static boolean isPrime(int x) {
        for (int i = 2; i < x - 1; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}










//        int numer = scanner.nextInt();
//
//        for (int i = 1; i <= numer; i++) {
//            int licznik = 1;
//            for (int j = 1; j < i; j++) {
//                if (licznik < 1) {
//
//                }
//            }

            //czy liczba jest liczbą pierwszą true/false

