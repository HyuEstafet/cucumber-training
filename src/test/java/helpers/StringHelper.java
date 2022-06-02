package helpers;

public class StringHelper {

    public static boolean compareWords(String firstString, String secondString, boolean isCaseSensitive) {

        return isCaseSensitive == true ? (firstString.equals(secondString)) : firstString.equalsIgnoreCase(secondString);
    }

    public int countWords (String words) {
        String[] wordsArray = words.split(" ");
        return wordsArray.length;
    }
}



