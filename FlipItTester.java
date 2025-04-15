import java.util.Scanner;

public class FlipItTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTestCases = Integer.parseInt(input.nextLine());

        for (int i = 0; i < numTestCases; i++) {
            String text = input.nextLine();
            String reversedText = FlipIt.reverseString(text);
            System.out.println(reversedText);
        }

        input.close();
    }
}