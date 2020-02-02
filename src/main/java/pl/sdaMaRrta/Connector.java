package pl.sdaMaRrta;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Connector {
    public static final String NOT_FOUND = "NOT FOUND";
    private static final String URL_TEMPLATE = "https://horoskopy.gazeta.pl/horoskop/[placeholder]/dzienny";


    public static String getPage(String zodiacSign) {
        String name;
        String fullUrl = URL_TEMPLATE.replace("[placeholder]", zodiacSign);
        String requestResult;
        try {
            requestResult = Jsoup.connect(fullUrl).get().html();
        } catch (IOException e) {
            requestResult = NOT_FOUND;
            e.printStackTrace();
        }
        return requestResult;

//        - utworzyć stringa z urlTemplate z podstawionym w miejsce placeholder znakiem zodiaku.
//        - następnie wykonać Jsoup.connect(url).get().html() i zapisać wynik do stringa
//        Tworząc tą metodę testuj ją w klasie main aby mieć pewność, że działa

//        Usprawnij aplikację. Niech na początku pyta użytkownika o imię i datę urodzenia.
//        Sparsuj datę urodzenia na LocalDate. Utwórz klasę ZodiacSignRecogniser z metodą getSign
//        która na podstawie daty urodzenia poda horoskop.
//        10. Do końcowego Stringa dodaj imię użytkownika np "[Hej Krzysztof], Barany dzisiaj..."

    }

    public void getHoroscopeText(String pageAsText) {

        Pattern pattern = Pattern.compile("Twoj horoskop na dzisiaj to " + pageAsText);
        Matcher matcher = pattern.matcher(pageAsText);

//        if(matcher.find()){
//            result = matcher.group();
//        }
//        Szczegóły działania: https://www.samouczekprogramisty.pl/wyrazenia-regularne-w-jezyku-java/
//        Tworząc metodę testuj jej działanie wywołując ją z metody main.
    }
}



