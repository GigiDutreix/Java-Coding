import java.util.Scanner;

public class AroundTheClock {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        int departureTime = scanner.nextInt();
        int travelTime = scanner.nextInt();

        
        int totalTime = (departureTime + travelTime) % 12;

        if (totalTime == 0) {
            totalTime = 12;
        }

        System.out.println(totalTime);

        scanner.close();
    }
}
