import java.util.Scanner;

public class PapersPlease {
    public static void main(String[] args)
    { Scanner input = new Scanner(System.in);
boolean passport = input.nextBoolean();
boolean license = input.nextBoolean();
boolean certificate = input.nextBoolean();

if (passport) {
    System.out.println(true);
}

else if (!passport && (license && certificate))
{System.out.println(true);
}
else {System.out.println(false);}

    
}

        
    }
