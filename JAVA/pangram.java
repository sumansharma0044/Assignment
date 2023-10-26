import java.util.Scanner;
public class pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkPangram(input.toLowerCase());

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    public static boolean checkPangram(String sentence) {
        boolean[] alphabetPresence = new boolean[26];
        int alphabetCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (Character.isLetter(c)) {
                int index = c - 'a';

                if (!alphabetPresence[index]) {
                    alphabetPresence[index] = true;
                    alphabetCount++;
                }

                if (alphabetCount == 26) {
                    return true; // All alphabets are present
                }
            }
        }

        return false; // Not all alphabets are present
    }
}
