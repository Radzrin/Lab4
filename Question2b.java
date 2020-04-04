import java.util.*;

//redo q2 but with loops
  
 public class Question2b{ 
    public static void main(String[] args) {
		
		 System.out.println("please put in your email");
		 System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		String comma = ".";
		String at = "@";
	    String email;
	    String begining = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@"; 
	    email = sc.nextLine();
	    int i = email.length();
	    
	    
	    //check to see if the email is too long or too short
	    for (i =0; i <=254; i++) {
        if (email ==null){
        System.out.println("email invalid");
        System.out.println("");
        break;
	    } else if (i > 254){
	        System.out.println("Email invalid: email is too long");
	    break;}
	    }
         
        //program checks if @ and . are present
        for (i =0; i <=254; i++) {
        if(email.charAt(i) == '@') { 
                i++;
        }else{ 
        System.out.println("the email is invalid missing an @");
       }
       
        for (i =0; i <=254; i++) {
        if(email.charAt(i) == '.') { 
                i++;
            }else {
            System.out.println("");    
             System.out.println("email invalid comma missing");   
            break;}
        }
         } 
            
        } 
         
    } 

