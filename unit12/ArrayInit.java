public class ArrayInit 
{
	public static double[][] arrayInit()
	{
		double[][] result = new double[5][5];
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(i == j)
					result[i][j] = 2;
				else
					result[i][j] = 0;
			}
		}
		
		return result;
		
	}
	
	public static String[][] arrayString()
	{
		String[][] result = new String[5][5];
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				result[i][j] = "hello";
			}
		}
		
		return result;
	}
	
	public static int[][] sixFive()
	{
		int[][] result = new int[6][5];
		
		int k = 0;
		
		for(int i = 0; i < 6; i++)
		{
			k ++;
			
			for(int j = 0; j < 5; j++)
			{
				result[i][j] = k;
			}
		}
		
		return result;
		
	}
	
	public static double[][] tens()
	{
		double[][] result = new double[5][5];
		
		int k = 5;
		
		for(int i = 0; i < 5; i++)
		{
			k += 5;
			
			for(int j = 0; j < 5; j++)
			{
				k ++;
				result[i][j] = k;
			}
		}
		
		return result;
	}
	
	public static void printStuff(double[][] values)
	{
		for (double[] row : values) 
			{
				for (double value : row) 
					{
						System.out.print(value + " ");
					}
					
            System.out.println();
            
			}
	}
	
	public static void printStuff2(String[][] values)
	{
			for (String[] row : values) 
			{
				for (String value : row) 
					{
						System.out.print(value + " ");
					}
					
            System.out.println();
            
			}
	}
	
	public static void printStuff3(int[][] values)
	{
		for (int[] row : values) 
			{
				for (int value : row) 
					{
						System.out.print(value + " ");
					}
					
            System.out.println();
            
			}
	}
	
	
	
	public static void main(String[] args)
	{
		double[][] init = arrayInit();
        System.out.println("result:");
        printStuff(init);
        
        String[][] strings = arrayString();
        System.out.println("result:");
        printStuff2(strings);
        
        int[][] six = sixFive();
        System.out.println("result:");
        printStuff3(six);
        
        double[][] tens = tens();
        System.out.println("result:");
        printStuff(tens);
	}
}

