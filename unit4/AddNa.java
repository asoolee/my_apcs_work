public class AddNa{
	
	public static String addNa(int n){
		
		String result = ("ba");
		for (int i = 0; i < n; i++){
			
			result = result + "na";
			
			}
		
		return result;
		
	}
			
	public static void testAddNa(int n, String expected){
		
		String result = addNa(n);
		
		System.out.println("n:" + n + 
						   " expected:" + expected +
						   " result:" + result);
						   
		if(result.equals(expected))
		System.out.println("^_^");
		else
		System.out.println(":(");
		
		}
		
	public static void main(String[] args){
		
		testAddNa(0, "ba");
		testAddNa(1, "bana");
		testAddNa(2, "banana");
		
		}
		
	
	}
