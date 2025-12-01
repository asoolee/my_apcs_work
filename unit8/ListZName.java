import java.util.*;

public class ListZName
{
	public static int zName(ArrayList<String> str)
	{
		int count = 0;
		
		for(String s : str)
		{
			if(s.substring(0,1).equals("Z") || s.substring(0,1).equals("z"))
			count += s.length();
		}
		
		return count;
	}
	
	public static void testZName(ArrayList<String> str, int expected)
	{
		int result = zName(str);
		
		for(String s : str)
		System.out.println(s + " ");
		
		System.out.println("expected: " + expected +
						   "result: " + result);
						   
		if(result == expected)
		System.out.println("^_^");
		else
		System.out.println("DISFJOISD");
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> values1 = new ArrayList<String>();
		values1.add("Dr. Kessner");
		values1.add("Dr. Sands");
		
		ArrayList<String> values2 = new ArrayList<String>();
		values2.add("Zorro");
		values2.add("zero");
		values2.add("zippy");

		testZName(values1, 0);
		testZName(values2, 14);
	}
}
