public class FindSecondOccurrence{
	
	public static int find2nd(String str){
		
		int count = 0;
		int result = 0;
		
		for(int i = 0; i < str.length(); i++){
			
			String a = str.substring(i,i+1);
			
			if(a.equals("a"))
			count++;
			
			if(count == 2 && result == 0)
			result = i;
			
			
			}
			
			return result;
		
		}
		
	public static void testFind2nd(String str, int expected){
		
		int result = find2nd(str);
		
		System.out.println("str:" + str + 
						   " expected:" + expected +
						   " result:" + result);
						   
		if(result == expected)
		System.out.println("^_^");
		else
		System.out.println(":(");
		
		}
		
	public static void main(String[] args){
	
		testFind2nd("banana", 3);
		testFind2nd("happy birthday", 12);
		
	}
	
	}
