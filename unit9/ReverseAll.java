public class ReverseAll
{
	public static String[] reverseAll(String[] str)
	{
		String[] result = new String[str.length];
		
		for(int i = 0; i < str.length; i++)
		{
			result[i] = reverse(str[i]);
		}
		
		return result;
	}
	
	public static String reverse(String str)
	{
		String rev = ("");
		for(int i = (str.length()-1); i >= 0; i--)
			{
				rev += str.substring(i, i+1);
			}
		return rev;
	}
	
	public static void main(String[] args)
	{
		String[] str = {"abcd", "xyz"};
		
		 System.out.print("words: ");
        for (String s : str)
            System.out.print(s + " ");
        System.out.println();
        
        String[] newStr = reverseAll(str);
        
        System.out.print("reversed: ");
        for (String s : newStr)
            System.out.print(s + " ");
        System.out.println();
	}

}
