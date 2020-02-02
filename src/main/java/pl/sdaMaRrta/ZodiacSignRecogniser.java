package pl.sdaMaRrta;

public class ZodiacSignRecogniser {

    public static void getSign() {

                int dayOfBirth, monthOfBirth;
                String zodiacSign;

                if (monthOfBirth == 01 ) {
                    if (dayOfBirth < 20)
                        zodiacSign = "koziorożec";
                    else
                        zodiacSign = "wodnik";
                } else if (monthOfBirth == 02) {
                    if (dayOfBirth < 19)
                        zodiacSign = "wodnik";
                    else
                        zodiacSign = "Ryby";
                } else if(monthOfBirth == 03) {
                    if (dayOfBirth < 21)
                        zodiacSign = "Ryby";
                    else
                        zodiacSign = "Baran";
                } else if (monthOfBirth == 04) {
                    if (dayOfBirth < 20)
                        zodiacSign = "Baran";
                    else
                        zodiacSign = "Byk";
                } else if (monthOfBirth == 05) {
                    if (dayOfBirth < 21)
                        zodiacSign = "Taurus";
                    else
                        zodiacSign = "Gemini";
                } else if( monthOfBirth == 06) {
                    if (dayOfBirth < 21)
                        zodiacSign = "Gemini";
                    else
                        zodiacSign = "Cancer";
                } else if (monthOfBirth == 07) {
                    if (dayOfBirth < 23)
                        zodiacSign = "Cancer";
                    else
                        zodiacSign = "Leo";
                } else if( monthOfBirth == 08) {
                    if (dayOfBirth < 23)
                        zodiacSign = "Leo";
                    else
                        zodiacSign = "Virgo";
                } else if (monthOfBirth == 09) {
                    if (dayOfBirth < 23)
                        zodiacSign = "Virgo";
                    else
                        zodiacSign = "Libra";
                } else if (monthOfBirth == 10) {
                    if (dayOfBirth < 23)
                        zodiacSign = "Libra";
                    else
                        zodiacSign = "Scorpio";
                } else if (monthOfBirth == 11) {
                    if (dayOfBirth < 22)
                        zodiacSign = "scorpio";
                    else
                        zodiacSign = "Sagittarius";
                } else if (monthOfBirth == 12) {
                    if (dayOfBirth < 22)
                        zodiacSign = "Sagittarius";
                    else
                        zodiacSign ="Capricorn";
                }
                System.out.println("The astrological sign for " + dayOfBirth + " " + monthOfBirth + " is " + zodiacSign );
            }
        }

        Integer[] dayOfBirth = {01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

        Integer[] monthOfBirth = {01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12};

        Integer[][] dateOfBirth = [31][12];


//        Wodnik (20 stycznia – 18 lutego)
//        Ryby (19 lutego – 20 marca)
//        Baran (21 marca – 19 kwietnia)
//        Byk (20 kwietnia – 20 maja)
//        Bliźnięta (21 maja – 20 czerwca)
//        Rak (21 czerwca – 22 lipca)
//        Lew (23 lipca – 22 sierpnia)
//        Panna (23 sierpnia – 22 września)
//        Waga (23 września – 22 października)
//        Skorpion (23 października – 21 listopada)
//        Strzelec (22 listopada – 21 grudnia)
//        Koziorożec (22 grudnia – 19 stycznia)


    }
}
// Utwórz klasę ZodiacSignRecogniser z metodą getSign
//        która na podstawie daty urodzenia poda horoskop.
