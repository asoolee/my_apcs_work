public class Reverse{
	
	public static String reverse(String str){
		
		String result = ("");
		
		for(int i = (str.length()-1); i >= 0; i--){
			
			result = result + str.substring(i, i+1);
			
			}
		
		return result;
		
		}
		
		
	public static void testReverse(String str, String expected){
		
		String result = reverse(str);
		
		System.out.println("str:" + str +
						   " expected:" + expected +
						   " result:" + result);
		
		if (result.equals(expected))
			System.out.println("^_^");
		else 
			System.out.println(":(");
		
		}
		
	public static void main(String[] args){
		
		testReverse("bad", "dab");
		testReverse("Hello, world!", "!dlrow ,olleH");
		testReverse("tacocat", "tacocat");
		
		}
	
	}
