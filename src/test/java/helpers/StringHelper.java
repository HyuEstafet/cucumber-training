package helpers;

public class StringHelper {

    public static void main(String[] args) {
        String f1 = "Java";
        String f2 = "lava";
        boolean stringsAreEqual = compareWords(f1, f2);
        System.out.println("Both strings are equal?: " + stringsAreEqual);

    }

    public static boolean compareWords(String firstString, String secondString) {

        if (firstString.equalsIgnoreCase(secondString)) {
            return true;
        } else if (firstString.equals(secondString)) {
            return true;
        } else {
            return false;
        }
    }
}



