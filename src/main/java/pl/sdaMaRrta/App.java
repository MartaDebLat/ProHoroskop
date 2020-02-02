package pl.sdaMaRrta;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Witaj! Podaj swoje imię.");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Podaj swoją datę urodzenia w formacie dd.mm ");
        String dateofbirth = scan.nextLine();
//        LocalDate
        String horoskopeMessage = "....";
        System.out.println("Drogi " + name + " " + dateofbirth + " " + "twój horoskop na dzisiaj to: " + horoskopeMessage);
        String requestResult = Connector.getPage(scan.nextLine());


        if (requestResult.equals(Connector.NOT_FOUND)) {
            horoskopeMessage = HoroskopeExtractor.getHoroscopeText(requestResult);
        }

        System.out.println(horoskopeMessage);
    }

    public static void testHoroscopeExtractor() {

    }


}
