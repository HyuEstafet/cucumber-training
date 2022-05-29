package helpers;

public class StringHelper {

    public static boolean compareWords(String firstString, String secondString, boolean isCaseSensitive) {

        if (isCaseSensitive) {
            return (firstString.equals(secondString));
        } else {
            return (firstString.equalsIgnoreCase(secondString));
        }
    }

    public int countWords (String words) {
        String[] wordsArray = words.trim().split("\\s");
        return wordsArray.length;
    }

    public void main(String[] args) {
        String str1 = "     This is my example text that I will use for counting the words in this task";
        System.out.println(countWords(str1));
    }
}



