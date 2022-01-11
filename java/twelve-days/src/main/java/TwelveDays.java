class TwelveDays {

    String initials = "On the";
    String onDay = "of Christmas my true love gave to me: ";
    String[] lyrics = {
            "",
            "a Partridge in a Pear Tree.\n",
            "two Turtle Doves, ",
            "three French Hens, ",
            "four Calling Birds, ",
            "five Gold Rings, ",
            "six Geese-a-Laying, ",
            "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ",
            "nine Ladies Dancing, ",
            "ten Lords-a-Leaping, ",
            "eleven Pipers Piping, ",
            "twelve Drummers Drumming, "
    };
    String[] numNames = {
            "",
            " first",
            " second",
            " third",
            " fourth",
            " fifth",
            " sixth",
            " seventh",
            " eighth",
            " ninth",
            " tenth",
            " eleventh",
            " twelfth",
    };

    String verse(int verseNumber) {
        String daynum = initials + numNames[verseNumber] + " day " + onDay;
        String para = "";
        for (int i = 1; i <= verseNumber; i++) {
            if (i == 2)
                para = lyrics[i] + "and " + para;
            else
                para = lyrics[i] + para;
        }
        return daynum + para;

    }

    String verses(int startVerse, int endVerse) {

        String collectVerse = "";
        for (int j = startVerse; j <= endVerse; j++) {
            String daynum = initials + numNames[j] + " day " + onDay;
            String para = "";
            for (int i = 1; i <= j; i++) {
                if (i == 2)
                    para = lyrics[i] + "and " + para;
                else
                    para = lyrics[i] + para;
            }
            if (j == endVerse)
                collectVerse += daynum + para;
            else
                collectVerse += daynum + para + "\n";

        }
        return collectVerse;
    }

    String sing() {
        String collectVerse = "";
        for (int j = 1; j <= 12; j++) {
            String daynum = initials + numNames[j] + " day " + onDay;
            String para = "";
            for (int i = 1; i <= j; i++) {
                if (i == 2)
                    para = lyrics[i] + "and " + para;
                else
                    para = lyrics[i] + para;
            }
            if (j == 12)
                collectVerse += daynum + para;
            else
                collectVerse += daynum + para + "\n";

        }
        return collectVerse;
    }
}
