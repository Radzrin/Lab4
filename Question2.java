import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
import java.util.*;
  
 public class Question2 { 
 
 /**
 *This is my main method
 */
    public static boolean isValid(String email) {
		
		/*characters it has to refer to check if the email is valid or not
		and the order of the email*/
        
		String characters = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                            
                            
        //check if the characters are present                              
        Pattern pat = Pattern.compile(characters); 
		
		//if you write nothing it will assume that it's false
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
  
    /* check  email*/
    public static void main(String[] args) 
    { 
		//variable
        String email;
        
		//prompts the user for their email adress
        System.out.println("insert your email here");
        System.out.println("");
        
		//user enters their email adress
        Scanner sc = new Scanner(System.in);
        email = sc.nextLine();
        
		//outputs the result 
        if (isValid(email)) {
        System.out.print("This email valid"); 
        }else {
        System.out.print("This email is invalid maybe something is missing"); 
		}
    } 
} 
