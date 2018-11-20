//Nickolas Gadomski
//Simple project integrating all concepts learned through COP 2005

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to my Integration Project!");
		System.out.println("Here are all of Java's Data Types");
		System.out.println( " byte = -128 to 127 inclusive short = -32768 to 32767 \n int = -2^31 to 2^31-1 \n long = -2^63 to 2^63-1 "
		         + "\n float & double = #.##  \n boolean = true || false \n char = ASCII" );
		
		int myAge = 23; // equal operator means is assigned to
	    double myHeight = 5.6;
	    String myName = "Nickolas Gadomski";
	    final String DATE_OF_BIRTH = "04/05/1995"; // final means constant (never changes)
	    
	    String yearOfBirth = DATE_OF_BIRTH.substring(6,10);
	    System.out.println("I was born in the year " + yearOfBirth);
	    
	    System.out.printf(
	        "My name is %s, I was born on %s, " + "so I'm %d years old, and my" + " height is %f",
	        myName, DATE_OF_BIRTH, myAge, myHeight); // formating with escape sequences

	    System.out.println("-");

	    double sum = (double) (myAge) + myHeight; // casting you turn a lighter type to a heavier type

	    System.out.println(sum);
	    System.out.println("Variable: a location in memory. \nScope = Where you can access the variable");
	    
	    boolean nickMale = true; // using boolean
	    if (nickMale == true) 
	      System.out.println("Nick is indeed a male!");
	    else 
	      System.out.println("Nick is not a man");

	    System.out.println("-");
	    
	    System.out.println("chatAt(2) " + myName.charAt(2)); // return a char = s
	    System.out.println("substring(2, 7) " + myName.substring(2, 7)); // returns 
	    System.out.println("length() " + myName.length()); // returns length of such string
				

	    
	    String result; // the ternary operator will assign a value
	    System.out.println(result = (nickMale == false) ? "Nick is indeed a male! (ternary)" // conditional operator '?'
	        : "Nick is not a man (ternary)"); // ternary condition
	   		  
	      String name = ("Nick");
		  String name2 = ("Nick");
		 // equals method
		if (name.equals(name2)){
			System.out.println("We Have the same name!");
		 }
		else{
			System.out.println("We have different names");
		} 
		//compareTo method
		
		   System.out.println("This following block of code will compare strings");
		    String alpha = "Gadomski";
		    String bravo = "GsDomski";
		    String charlie = ("Gadomski");
		    
		    System.out.println(alpha.equals(bravo));
		    System.out.println(charlie.equals(alpha)); // .equals() means String content
		    // Strings are immutable
		    System.out.println(alpha == bravo);
		    System.out.println(charlie == alpha); // == means value in memory
		    
		    int zeroIsLexicographicallyEqual = alpha.compareTo( charlie );
		    
		    System.out.println("alpha.compareTo( charlie ) -> " + zeroIsLexicographicallyEqual);
		    System.out.println("End of String comparison.");
		    System.out.println("-");
		    
	char Char = 'B'; // single quotes cause it's a char 
	  switch (Char) { // case switch
      case 'A':
        System.out.println("It's Alpha");
        break;
      case 'B':
        System.out.println("It's Bravo");
        break;
      case 'C':
        System.out.println("It's Charlie");
        break;
      default:
        System.out.println("Phonetic Alphabet");
	  }
	  
	  int number = -34;
	    if (number > 0 || number < 0) { // conditional operator with OR and relational operators < , >
	      System.out.println("Thank God number is not 0.");
	    }
	    number = 30;
	    if (number < 50 && number > 25) // conditional operator with AND and relational operators < , >
	      System.out.println("number is within the range.");
	    
	    System.out.println("alpha.compareTo( charlie ) -> " + zeroIsLexicographicallyEqual);
	    System.out.println("End of String comparison.");
	    System.out.println("-");
	    number = 30;
	    System.out.println("number + 20 =" + (number + 20)); // sum
	    System.out.println("number - 2 =" + (number - 2)); // subtract
	    System.out.println("number * 3 =" + (number * 3)); // multiply
	    System.out.println("number / 2 =" + (number / 2)); // divide
	    System.out.println("number % 2 =" + (number % 2)); // mod
	    System.out.println("number++ =" + (number++)); // increment by 1
	    System.out.println("number-- =" + (number--)); // decrement by 1
	    System.out.println("number += 2 =" + (number += 2)); // increment variable by n (n=2 in this case)
	    System.out.println("Math class: " + Math.pow(2, 6));
	
	    


	    Random randers = new Random(); // random class

	    for (int i = 1; i <= 5; i++) { //

	      int a = randers.nextInt(69);
	      System.out.println("randy the random generator generated: " + a);
	    } // for loop
	    
	    	    String myGuy = myGuyMethod(myName); // calling method with argument
	    System.out.println(myGuy);
	    myGuyVoid(); // void method call
	}




	private static void myGuyVoid() { // method header
	    System.out.println("Hello! (from void!)");

	  }

	  private static String myGuyMethod(String name) { // method head with parameters
	    return "Hello!, my name is " + name;

	  }
	  
    
	  		 
}	  


