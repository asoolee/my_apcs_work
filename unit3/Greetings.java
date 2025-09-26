public class Greetings{
	
	public static String greetings(String greeting){
		
		return ("Hello, " + greeting + ", how are you?");
		
		}
		
	public static void testGreetings(String greeting, String expected){
		
		String results = greetings(greeting);
		
		System.out.println("greeting:" + greeting +
						   " expected:" + expected +
						   " results:" + results);
		
		if (results.equals(expected))
			System.out.println("^_^!");
		else
			System.out.println("NOOOO");
		
		}
		
	public static void main(String[] args){
		testGreetings("Sarah", "Hello, Sarah, how are you?");
		testGreetings("Arabella", "Hello, Arabella, how are you?");
		testGreetings("Diana", "Hello, Diana, how are you?");
		testGreetings("Adison", "Hello, Adison, how are you?");
		}
	}
