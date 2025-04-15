import java.util.Scanner;

public class FlipIt {

    public static String reverseString(String text) {
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter("");
        String reversedText = "";
        while (scanner.hasNext()) {
            reversedText = scanner.next() + reversedText;
        }
        scanner.close();
        return reversedText;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTestCases = Integer.parseInt(input.nextLine());

        for (int i = 0; i < numTestCases; i++) {
            String text = input.nextLine();
            String reversedText = reverseString(text);
            System.out.println(reversedText);
        }

        input.close();
    }
}