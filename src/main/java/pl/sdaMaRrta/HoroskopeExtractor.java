package pl.sdaMaRrta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoroskopeExtractor {

    public static String getHoroscopeText(String pageText) {
        Pattern horoscopePattern = Pattern.compile("");
        Matcher horoscopeMatcher = horoscopePattern.matcher(pageText);
        return null;
    }
}
