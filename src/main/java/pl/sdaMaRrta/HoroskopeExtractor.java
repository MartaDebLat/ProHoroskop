package pl.sdaMaRrta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoroskopeExtractor {

    private static final String PATTERN = "\"<p class=\"lead\">.+\"";

    public static String getHoroscopeText(String pageText) {
        Pattern horoscopePattern = Pattern.compile("<p class=\"lead\">.+");
        Matcher horoscopeMatcher = horoscopePattern.matcher(pageText);
        String foundText = ("");
        if (horoscopeMatcher.find()) {
            foundText = horoscopeMatcher.group();
        }

        return foundText;
    }
}
