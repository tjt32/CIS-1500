import java.util.*;
public class College_Credit {

	public static void main(String[] args) {
		//Define the Variables
		int x;
		int y;
		int z;	
		//Outputs
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in); 
		 
	    System.out.println("Hello Person!?! my sole purpose is to serve college students to estimate their college cost. What is your name?"); 
	    String name = ss.nextLine(); 
	    System.out.println(name + ", What is the amount of credits you have passed"); 
	    int degree = ss.nextInt();
	    System.out.println(name + ", How many of these credits things do you need to get an associates degree");
	    int pSemester = ss.nextInt();
	    System.out.println(name + ", Wait you have to pay to expand your knowledge, tell me the cost per class");
	    int cCredit = ss.nextInt();
	    
	    x = pSemester - degree;
	    y = x / degree;
	    z = x * cCredit;
	    
	    System.out.println("Calculating...");
	    System.out.println(name +", based on some super complicated math it will take one " + y + " semesters to finish your degree which will cost one $" + z + " + don't forget the paper tax I mean stamp act wait I mean tottaly not a scam college textbooks!!!");
	    
	    
		
	}

}
