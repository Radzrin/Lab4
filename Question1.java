import java.util.Scanner;

 public class Main
 {
   public static void main(String [] args)
   {
     Scanner scan = new Scanner(System.in);
   		
   		System.out.println("Enter a sentence or a word to see if it's a palindrome");
        System.out.println(""); 
    
    //variables
        String reverse = "";
		String word = scan.nextLine();
		String smallWords = word.toLowerCase();
		
		

     //loop
     for ( int i = smallWords.length() - 1; i >=0; i--)
     {
         reverse += smallWords.charAt(i);
     }

        System.out.println("The sentence backwards is: \n" + reverse.trim());
        System.out.println(smallWords);
        System.out.println("");
        
        System.out.println(smallWords.equals(reverse));
   }
 }


