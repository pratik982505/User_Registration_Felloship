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
	
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		user.firstName();
	}

}
