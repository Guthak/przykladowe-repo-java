import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie18 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        boolean userSneeze = doesUserSneeze(userInput);

        if(userSneeze) {
            System.out.println("Kichnął");
        } else {
            System.out.println("Nie kichnął");
        }


    }


   private static boolean doesUserSneeze (String userInput) {

       Pattern sneezePattern = Pattern.compile("a+ psik");

       Matcher matcher = sneezePattern.matcher(userInput);

       return matcher.find();


   }




}
