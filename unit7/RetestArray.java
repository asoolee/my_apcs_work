public class RetestArray {
	
	public static int retestArray (int[] nums) {
		int total = 0;
		
		for(int i = 0; i < nums.length; i ++)
		{
			if(nums[i]% 5 == 0)
			{
				total+= nums[i];
			}
		}
		
		return total;
		
	}
	
	public static void testRetestArray(int[] nums, int expected)
	{
		int result = retestArray(nums);
		
		for(int n : nums)
		{
			System.out.println(n + " ");
		}
		
		System.out.println("expected: " + expected +
						   "result: " + result);
						   
		if(result == expected)
		System.out.println("^_^");
		else
		System.out.println("DISFJOISD");
		
	}
	
	public static void main(String[] args)
	{
		int[] values1 = {1, 2, 5};
		int[] values2 = {5,5,5};
		int[] values3 = {0,5,10,6,7,8};
		
		testRetestArray(values1 , 5);
		testRetestArray(values2, 15);
		testRetestArray(values3, 15);
	}
}

