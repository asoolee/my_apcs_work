public class SumOfSquares{
	
	
	public static int sumOfSquares(int n){
		
		int total = 0;
		
		for(int i = 1; i <= n; i++){
			
			total = total + i*i; 
			
			}
			
			return total;
		
		}
		
	public static void testSumOfSquare(int n, int expected){
		
		int results = sumOfSquares(n);
		
		System.out.println("n:" + n +
						   " expected:" + expected + 
						   " results:" + results);
		
		if(results == expected)
		System.out.println("^_^");
		else 
		System.out.println("NONOOONOOOONO0OO!!!");
		
		}
		
	public static void main(String[] args){
		
		testSumOfSquare(1, 1);
		testSumOfSquare(2, 5);
		testSumOfSquare(3, 14);
		
		}
	
	}
