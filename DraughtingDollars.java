import java.util.Scanner;

public class DraughtingDollars {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
      
        final double FULL_KEG_GALLONS = 15.5;
        final int OUNCES_PER_GALLON = 128;
        final int OUNCES_PER_PINT = 16;
        
       
        double beerRemaining;
       
        beerRemaining = input.nextDouble();
    
        double pricePerServing = input.nextDouble();
        
       
        double totalGallonsLeft = beerRemaining * FULL_KEG_GALLONS;
        double totalOuncesLeft = totalGallonsLeft * OUNCES_PER_GALLON;
        double totalServings = totalOuncesLeft / OUNCES_PER_PINT;  
        
      
        double totalValue = totalServings * pricePerServing;
       
        System.out.println("There is $" + String.format("%.2f", totalValue) + " of beer left in keg");
        
        input.close();
    }
}
