// 1.JAVA  B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

package Assigment;

public class Roman_Integer_Conversion {
    public static void main(String[] args) {
        System.out.println(romanToInt("X")); // 10
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char current = s.charAt(i);
            int currentValue = 0;

            switch (current) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
            }

            if (currentValue > prev) {
                result -= 2 * prev;
            }

            result += currentValue;
            prev = currentValue;
        }

        return result;
    }
}
