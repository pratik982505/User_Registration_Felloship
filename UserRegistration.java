import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {
	Scanner Scan = new Scanner(System.in);
    
	public void firstName() {
		System.out.println("Enter User's First Name:(First Letter Capital and minimum 3 characters)");
		String fName = Scan.nextLine();
		
		Pattern fNamePat = Pattern.compile("^[A-Z]+[A-Za-z]{2,12}$");
	    Matcher fNameMatch = fNamePat.matcher(fName);
	    boolean fNameverification = fNameMatch.find();
	    
	    if (fNameverification==false) {
	    	System.out.println("Invalid First Name!! Enter a Valid First Name");
	    	firstName();
	    }
	    else {
	    	System.out.println("Valid First Name: "+ fName);
	    }
	}
	
         public void lastName() {
           System.out.println("Enter User's Last Name:(First Letter Capit and minimum three charecters )");
                String lName = Scan.nextLine();
            Pattern lNamePat = Pattern.compile("^[A-Z]+[A-Za-z]{2,12}$");
	    Matcher lNameMatch = lNamePat.matcher(lName);
	    boolean lNameverification = lNameMatch.find();
	    
	    if (lNameverification==false) {
	    	System.out.println("Invalid Last Name!! Enter a Valid Last Name");
	    	lastName();
	    }
	    else {
	    	System.out.println("Valid Last Name: "+ lName);
	    }
	}
        public void email() {
		System.out.println("Enter Email Id:");
		String email = Scan.nextLine();
		
		Pattern emailPat = Pattern.compile("^([a-z]+[0-9a-z-!#$%+^&*_.]*){3,15}@[a-z]{3,8}[.]*([a-z]{2,4})*.[a-z]{2,4}");
	    Matcher emailMatch = emailPat.matcher(email);
	    boolean emailverification = emailMatch.find();
	    
	    if (emailverification==false) {
	    	System.out.println("Invalid Email Id!!");
	    	email();
	    }
	    else {
	    	System.out.println("Valid Email: "+ email);
	    }
	}	



	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		user.firstName();
                user.lastName();	
                user.email();  
   }

}
