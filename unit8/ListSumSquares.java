import java.util.*;

public class ListSumSquares 
{
	public static double sumSquares(ArrayList<Double> nums)
	{
		double total = 0;
		for(int i = 0; i < nums.size(); i ++)
		{
			total+= nums.get(i)*nums.get(i);
		}
		
		return total;
	}
	
	public static void testSumOfArray(ArrayList<Double> nums, double expected)
	{
		double result = sumSquares(nums);
		
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
		ArrayList<Double> values1 = new ArrayList<Double>();
		values1.add(0.0g);
		
		ArrayList<Double> values2 = new ArrayList<Double>();
		values2.add(1.0);
		values2.add(2.0);
		values2.add(3.0);
		
		ArrayList<Double> values3 = new ArrayList<Double>();
		values3.add(2.0);
		values3.add(2.0);
		values3.add(2.0);
		
		testSumOfArray(values1, 0);
		testSumOfArray(values2, 14.0);
		testSumOfArray(values3, 12.0);
	}
}
