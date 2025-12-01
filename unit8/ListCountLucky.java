import java.util.*;

public class ListCountLucky
{
	public static int listCountLucky(ArrayList<Integer> nums)
	{
		int count = 0;
		
		for(int i = 0; i < nums.size(); i ++)
		{
			if(nums.get(i) % 7 == 0 || nums.get(i) % 10 == 7)
			count ++;
		}
		
		return count;
	}
	
	public static void testCountLucky(ArrayList<Integer> nums, int expected)
	{
		int result = listCountLucky(nums);
		
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
		ArrayList<Integer> values1 = new ArrayList<Integer>();
		values1.add(1);
		values1.add(2);
		values1.add(3);
		
		ArrayList<Integer> values2 = new ArrayList<Integer>();
		values2.add(7);
		values2.add(13);
		values2.add(17);
		
		ArrayList<Integer> values3 = new ArrayList<Integer>();
		values3.add(107);
		values3.add(207);
		testCountLucky(values1, 0);
		testCountLucky(values2, 2);
		testCountLucky(values3, 2);
	}
}
