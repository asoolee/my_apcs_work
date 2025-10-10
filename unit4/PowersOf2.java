public class PowersOf2{
	
	
	public static int powersOf2(int n){
		
		int total = 0;
		int power = 1;
		
			if(n==0)
			total = 0;
			
		n --;
		
		for(int i = 0; i <= n; i++){
		
			total = total + power;
			power*=2;
			
			}
			
			return total;
		
		}
		
	public static void testPowersOf2(int n, int expected){
		
		int results = powersOf2(n);
		
		System.out.println("n:" + n +
						   " expected:" + expected + 
						   " results:" + results);
		
		if(results == expected)
		System.out.println("^_^");
		else 
		System.out.println(":(");
		
		}
		
	public static void main(String[] args){
		
		testPowersOf2(0,0);
		testPowersOf2(1,1);
		testPowersOf2(2,3);
		testPowersOf2(3,7);
		
		}
	
	}
