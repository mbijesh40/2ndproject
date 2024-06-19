import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userValue = 0;

        System.out.println("Enter a value ranging 1-9:");
        userValue = scan.nextInt();
        int computerValue= random.nextInt(10);

        while(userValue > computerValue)
        {
            System.out.println("The chosen value is little higher choose lower value:");
            userValue=scan.nextInt();

        }
         while(userValue < computerValue)
        {
            System.out.println("The chosen value is little lower choose higher value:");
            userValue=scan.nextInt();

        }
        if(userValue == computerValue){
            System.out.println("Congrats! You choose the right value.");
        }
    }
}
