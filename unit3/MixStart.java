public class MixStart{
	public static boolean mixStart(String str){
		if(str.length() < 3) return false;
  
		String ix = str.substring(1,3);
		
		return(ix.equals("ix"));
		
		}
		
	public static void testMixStart(String str, boolean expected){
		
		boolean results = mixStart(str);
		
		System.out.println("str:" + str +
						   " expected:" + expected + 
						   " results:" + results);
						   
		if(results == expected)
			System.out.println("Woohoo!");
		else 
			System.out.println("No!");
		}
		
	public static void main(String[] args){
		
		testMixStart("mix snacks", true);
		testMixStart("ni", false);
		testMixStart("piz snacks", false);
		
		}

	}
	
