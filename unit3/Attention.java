public class Attention{
	public static boolean attention(String str){
		
		if (str.length() < 9) return false;
		
		String attention = str.substring(0,9);
		
		return(attention.equals("Hey, you!"));
		
		}
	public static void testAttention(String str, boolean expected){
		
		boolean results = attention(str);
		
		System.out.println("str:" + str +
						   " expected:" + expected +
						   " results:" + results);
						   
		if(results == expected)
			System.out.println("^_^");
		else 
			System.out.println("NOOOOO");
		
		}
		
	public static void main(String[] args){
		
		testAttention("Hello, my name is Inigo Montoya.", false);
		testAttention("Excuse me, Dr. Kessner?", false);
		testAttention("Hey, you! Give me your code!", true);
		
		}
	}
