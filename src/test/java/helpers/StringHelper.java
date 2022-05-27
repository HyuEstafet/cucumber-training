package helpers;

public class StringHelper {

    public static boolean compareWords(String firstString, String secondString, boolean isCaseSensitive) {

        if (isCaseSensitive) {
            return (firstString.equals(secondString));
        } else {
            return (firstString.equalsIgnoreCase(secondString));
        }
    }
}



