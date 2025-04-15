import java.util.Scanner;

public class ClockTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int departureTime = scanner.nextInt();
        
   
        int travelTime = scanner.nextInt();
        
       
        if (departureTime == 0) {
            departureTime = 12;
        }
        
     
        int totalHours = departureTime + travelTime;
        
       
        int arrivalTime = ((totalHours - 1) % 12) + 1;
        
      
        if (arrivalTime == 12) {
            arrivalTime = 0;
        }
        
       
        System.out.println(arrivalTime);
        
        scanner.close();
    }
}