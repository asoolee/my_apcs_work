public class CountLucky
{
	public static int countLucky(int[] nums)
	{
		int count = 0;
		
		for(int i = 0; i < nums.length; i ++)
		{
			if(nums[i] % 7 == 0 || nums[i] % 10 == 7)
			count ++;
		}
		
		return count;
	}
	
	public static void testCountLucky(int[] nums, int expected)
	{
		int result = countLucky(nums);
		
		for(int n : nums)
		System.out.println(n + " ");
		
		System.out.println("expected:" + expected +
						   "result:" + result);
						   
		if(result == expected)
		System.out.println("^_^");
		else
		System.out.println("AHAHFAUHFAIHAHAHHH");
	}
	
	public static void main(String[] args)
	{
		int[] values1 = {1,2,3};
		int[] values2 = {7, 13, 17};
		int[] values3 = {107, 207};
		testCountLucky(values1, 0);
		testCountLucky(values2, 2);
		testCountLucky(values3, 2);
	}
}
