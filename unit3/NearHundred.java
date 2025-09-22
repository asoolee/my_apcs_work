public class NearHundred{
	public static boolean nearHundred(int n){
		return ((Math.abs(100-n) <= 10) ||
				(Math.abs(200-n) <= 10));
		}
		
	public static void testNearHundred(int n, boolean expected){
		boolean results = nearHundred(n);
		
		System.out.println("n:" + n +
						   " expected:" + expected + 
						   " results:" + results);
		    if(results == expected)
				System.out.println("Yay!");
			else 
				System.out.println("No!");
		}
		
	public static void main(String[] args){
		
		testNearHundred(93, true);
		testNearHundred(90, true);
		testNearHundred(89, false);
		}
	}
