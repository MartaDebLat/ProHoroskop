package pl.sdaMaRrta;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Witaj! Podaj swoje imię.");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Podaj swoją datę urodzenia w formacie dd.mm ");
        Scanner scanTwo = new Scanner(System.in);
        String dateofbirth = scan.nextLine();
//        LocalDate
        System.out.println("Drogi " + name + " " + dateofbirth + " " + "twój horoskop na dzisiaj to: " + "Tresc horoskopu.");
        String requestResult = Connector.getPage(scan;scanTwo);
        if (requestResult.equals(Connector.NOT_FOUND)){

        }
    }
}
