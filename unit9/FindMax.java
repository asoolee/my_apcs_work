public class FindMax
{
	public static double findMax(double[] values)
	{
		double result = values[0];
		
		 for (double value : values)
        {
            if (value > result)
                result = value;
        }
        
        return result;

	}
	
	public static void testFindMax(double[] values, double expected)
	{
		double result = findMax(values);
		
		for(double value : values)
		System.out.println(value + " ");
		
		System.out.println("expected:" + expected +
						   "result:" + result);
		
		if(result == expected)
		System.out.println("^_^");
		else
		System.out.println("AHAHFAUHFAIHAHAHHH");
	}
	
	public static void main(String[] args)
	{
		double[] values1 = {1.0, 2.1, 5.3};
		double[] values2 = {-35.0, 90.1, 0.0, 6.7};
		
		testFindMax(values1, 5.3);
		testFindMax(values2, 90.1);
	}
}
