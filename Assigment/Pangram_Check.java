/*1.JAVA C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)*/
package Assigment;

public class Pangram_Check {
    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // true
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        StringBuilder alphabet = new StringBuilder();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.append(c);
        }

        for (char c : str.toCharArray()) {
            if (alphabet.indexOf(String.valueOf(c)) != -1) {
                alphabet.deleteCharAt(alphabet.indexOf(String.valueOf(c)));
            }
        }

        return alphabet.length() == 0;
    }
}
