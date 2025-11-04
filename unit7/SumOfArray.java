public class SumOfArray 
{
	public static double sumOfArray(double[] nums)
	{
		double total = 0;
		for(int i = 0; i < nums.length; i ++)
		{
			total+= nums[i]*nums[i];
		}
		
		return total;
	}
	
	public static void testSumOfArray(double[] nums, double expected)
	{
		double result = sumOfArray(nums);
		
		for(double n : nums)
		System.out.println(n + " ");
		
		System.out.println("expected:" + expected +
						   "results:" + result);
						   
		if(result == expected)
		System.out.println("^_^");
		else
		System.out.println("NDOFI:JSODFIJAOU");
		
	}
	
	public static void main(String[] args)
	{
		double[] values1 = {0};
		double[] values2 = {1.0, 2.0, 3.0};
		double[] values3 = {2.0,2.0,2.0};
		
		testSumOfArray(values1, 0);
		testSumOfArray(values2, 14.0);
		testSumOfArray(values3, 12.0);
	}
}
