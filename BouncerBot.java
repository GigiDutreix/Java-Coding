import java.util.Scanner;

public class BouncerBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentMonth = scanner.nextInt();
        int currentDay = scanner.nextInt();
        int currentYear = scanner.nextInt();
        int birthMonth = scanner.nextInt();
        int birthDay = scanner.nextInt();
        int birthYear = scanner.nextInt();

        boolean isBirthday = (currentMonth == birthMonth && currentDay == birthDay);

       
        int age = currentYear - birthYear;

       
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--; 
        }

        
        boolean isOldEnough = age >= 21;

        boolean canEnter = isBirthday && isOldEnough;

        
        System.out.println(canEnter);

       
        scanner.close();
    }
}
