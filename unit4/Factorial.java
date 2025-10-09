public class Factorial{
	
	// fix... fi..x.x. hAHAHAHAHA
	
	
	public static int factorial(int n){
		
		if(n == 0 || n == 1)
		return 1;
		
		int total = 1;
		
		for(int i = 2; i <= n; i ++){
			
			total = total* i; 
			
			}
			
		return total;
		
		}
		
	public static void testFactorial(int n, int expected){
		
		int result = factorial(n);
		
		System.out.println("n:" + n + 
						   " expected:" + expected +
						   " result: " + result);
						   
		if(result == expected)
		System.out.println("^_^");
		else
		System.out.println(":(");
		
		}
	public static void main(String[] args){
		
		
		testFactorial(0,1);
		testFactorial(3, 6);
		testFactorial(5,120);
		
		}
	
	}
