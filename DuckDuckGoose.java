import java.util.Scanner;

public class DuckDuckGoose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int numKids = scanner.nextInt();
        
        
        int numDucks = scanner.nextInt();
        
       
        if (numKids <= 0) {
            System.out.println("Error: Number of kids must be positive");
        } else if (numDucks < 0) {
            System.out.println("Error: Number of ducks cannot be negative");
        } else {
          
            int goose = numDucks % numKids;
            
           
            System.out.println(goose);
        }
        
        scanner.close();
    }
}