public class Vampire{
	public static boolean isVampire(float hour, boolean awake){
		if((awake && (hour < 6 || hour > 22)) || (!awake && (hour >= 6 && hour <= 22))){
			return true;
			} else {
				return false;
			}
		}
		
		public static void testIsVampire(float hour, boolean awake, boolean expected){
			
			boolean result = isVampire(hour, awake);
			
			System.out.println("hour:" + hour + 
							   " awake:" + awake +
							   " expected:" + expected +
							   " result:" + result);
							   
			if (result == expected)
				System.out.println("Yay!");
			else
				System.out.println("No!");
			
			}
			
		public static void main(String[] args){
				
				testIsVampire(10, false, true);
				testIsVampire(22, false, true);
				testIsVampire(22, true, false);
				testIsVampire(10, true, false);
				testIsVampire(6, true, false);
				testIsVampire(6, false, true);
				testIsVampire(3,true, true);
				testIsVampire(3,false, false);
				testIsVampire(24, true, true);
				testIsVampire(24, false, false);
				
				}
			
	}
