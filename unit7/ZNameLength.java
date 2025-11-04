public class ZNameLength
{
	public static int zName(String[] str)
	{
		int count = 0;
		
		for(String s : str)
		{
			if(s.substring(0,1).equals("Z") || s.substring(0,1).equals("z"))
			count += s.length();
		}
		
		return count;
	}
	
	public static void testZName(String[] str, int expected)
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
		String[] values1 = {"Dr. Kessner", "Dr. Sands"};
		String[] values2 = {"Zorro", "zero", "zippy"};
		
		testZName(values1, 0);
		testZName(values2, 14);
	}
}
