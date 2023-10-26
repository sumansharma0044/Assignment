import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman number: ");
        String romanNumeral = scanner.nextLine();

        int result = romanToInt(romanNumeral);
        System.out.println("The equivalent integer is: " + result);
    }
    public static int romanToInt(String s) {
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentVal = getValue(s.charAt(i));
            int prevVal = (i > 0) ? getValue(s.charAt(i - 1)) : 0;

            if (prevVal < currentVal) {
                result += (currentVal - prevVal);
                i--;
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    public static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Invalid character
        }
    }
}
