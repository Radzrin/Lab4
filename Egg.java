import java.util.*;

public class Egg{
	public static void main(String[] args) {
	  

	    try{
	    Scanner sc = new Scanner(System.in);
	    int Num; 

	    System.out.println("Put in a number");
	    System.out.println("");
	    Num = sc.nextInt();
	    System.out.println("Thank you for your cooperation");
	    }catch (Exception e) {
		System.out.println("put in a number come on");
		//so try catch is like the end of the class
	
	    try{
		System.out.println("");
	    Scanner sc = new Scanner(System.in);	
		int Num = sc.nextInt();
		System.out.println("");
		System.out.println("Thank you for your cooperation");
	    }catch (Exception f) {
		System.out.println("sigh, ok ending program");
	    }
	    } 
	}        
}	







