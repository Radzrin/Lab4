import java.util.Scanner;
import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int random = rand.nextInt(100);
		boolean retry = true;
		
		while (retry) {
			
        for(int i=0; i<10;i++) {
			System.out.println("");
            System.out.print("Enter a number between 1-100: ");
            int number = input.nextInt();

            if (number > random) {
                System.out.println("Too Big");
                System.out.println("");
            } else if (number < random) {
                System.out.println("Too Small");
                System.out.println("");
            } else if (number == random) {
                
                System.out.println("Correct!");
				System.out.print("");
				System.out.print("want to play again? true/false: ");
				retry = input.nextBoolean();
               break;}
               
               if (i == 9) {
              System.out.print("");
              System.out.print("You lost the number was " + random);
               retry = false;
              
               }
            }
        }
                
    }
}
