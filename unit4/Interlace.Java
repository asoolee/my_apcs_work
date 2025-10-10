public class Interlace{
	
	public static String interlace(String one, String two){
		
		// null bound
		
		String result = ("");
		
		for (int i = 0; i < one.length() || i < two.length(); i++) {

            if (i < one.length()) {
                result = result + one.substring(i, i + 1);
            }
            if (i < two.length()) {
                result = result + two.substring(i, i + 1);
            }
        }
			
			
		return result;
		
		}
		
	public static void testInterlace(String one, String two, String expected){
	
		String result = interlace(one, two);
	
		System.out.println("one:" + one +
						  " two:" + two +
						  " expected:" + expected + 
						  " result:" + result);
						  
		if(result.equals(expected))
		System.out.println("^_^");
		else
		System.out.println(":(");
		
	}
	
	public static void main(String[] args){
		
		testInterlace("abc", "123", "a1b2c3");
		testInterlace("bed", "ras", "breads");
		
		}
	
	}
