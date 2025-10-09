public class CountOccurrences{
	
	// fix ... stil... fix...
	
	public static int countOccurrences(String str, String occurrence){
		
		int count = 0;
		
		for(int i = 0; i <= str.length() - occurrence.length(); i++){
			
			String detectOcc = str.substring(i, i + occurrence.length());
			
			if(detectOcc.equals(occurrence)){
				
				count++;
				
				}
			
			}
			
			return count;
		
		}
		
	public static void testCountOccurrences(String str, String occurrence, int expected){
		
		int results = countOccurrences(str, occurrence);
		
		System.out.println("str:" + str +
						   " occurence:" + occurrence +
						   " expected:" + expected +
						   " result:" + results);
						   
        if(results == expected)
        System.out.println("^_^");
        else
        System.out.println("NONOOO!NOON!ON!ONOOO!");
		
		}
		
	public static void main(String[] args){
		
		testCountOccurrences("Mississippi", "iss", 2);
		testCountOccurrences("banananana", "na", 4);
		
		}
	
	}
