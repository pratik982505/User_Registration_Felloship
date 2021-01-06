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
       public void mobileNumber() {
		System.out.println("Enter Mobile Number:(Country Code<space>Mobile Number)");
		String number = Scan.nextLine();
		
		Pattern numberPattern = Pattern.compile("^([+]*[1-9]{1}[-]*)[-0-9]{1,4}[\" \"]([1-9]?[0-9]{9})$");
	    Matcher numberMatch = numberPattern.matcher(number);
	    boolean numberVerification = numberMatch.find();
	    
	    if (numberVerification==false) {
	    	System.out.println("Invalid Mobile Number!!");
	    	email();
	    }
	    else {
	    	System.out.println("Valid Mobile Number: "+ number);
	    }
	}

        public void password() {
	    System.out.println("Enter Password:(One Letter Capital and minimum 8 characters)");
	    String password = Scan.nextLine();
		
	    Pattern passwordPat = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
	    Matcher passwordMatch = passwordPat.matcher(password);
	    boolean passwordVerification = passwordMatch.find();
	    
	    if (passwordVerification==false) {
	    	System.out.println("Invalid Password!! Enter a Valid Password");
	    	password();
	    }
	    else {
	    	System.out.println("Valid Password: **********");
	    }
	}
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		user.firstName();
                user.lastName();	
                user.email();  
                user.mobileNumber();   
                user.password();
}

}
