import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {


        System.out.println("Podaj pierwszą liczbę");
        Scanner userNumber1 = new Scanner (System.in);
        int number1 = userNumber1.nextInt();

        System.out.println("Podaj znak działania");
        Scanner userSign = new Scanner(System.in);
        String sign = userSign.next();

        System.out.println("Podaj drugą liczbę");
        Scanner userNumber2 = new Scanner (System.in);
        int number2 = userNumber2.nextInt();

        int sum;


        if (sign.equals("+")) {
            sum = number1 + number2;
        } else if (sign.equals("-")) {
            sum = number1 - number2;
        } else if (sign.equals("*")){
            sum = number1 * number2;
        } else if (sign.equals("/")) {
            sum = number1 / number2;
        } else
            System.out.println("Błędny znak");





    }


}
