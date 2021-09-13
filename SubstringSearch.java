package substrings;

import java.util.regex.*;

class SubstringSearch {
    
    static String InputString, Result;
    static Pattern aaPATTERN, ooPATTERN;
    static Matcher aaMATCHER, ooMATCHER;

    SubstringSearch(String InputString) {
        this.InputString = InputString;
        Searching();
    }

    /**
     * Метод,отвечающий за посик подстрок в заданной строке.
     */
    public static void Searching() {

        aaPATTERN = Pattern.compile(".*" + "aa" + ".*");
        ooPATTERN = Pattern.compile(".*" + "00" + ".*");

        aaMATCHER = aaPATTERN.matcher(InputString);
        ooMATCHER = ooPATTERN.matcher(InputString);

        if (aaMATCHER.find() == true | ooMATCHER.find() == true) {
            Result = "Yes";
        } else {
            Result = "No";
        }

        System.out.println("Result:" + Result);

    }

}
