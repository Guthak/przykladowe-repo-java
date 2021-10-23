import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        System.out.println("Podaj średnicę");

        Scanner srednica = new Scanner(System.in);
        double twojaSrednica = srednica.nextDouble();



        double obwod = Math.PI * twojaSrednica * 2;


        System.out.format("Obwód Twojego okręgu wynosi " + "%.2f%n", obwod);


    }







}
