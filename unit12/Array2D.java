public class Array2D
{
	public static int smallest(int[][] values)
	{
		int result = values[0][0];
		
		for(int[] row : values)
		{
			for(int value : row)
			{
				if(value < result)
				{
					result = value;
				}
			}
		}
		
		return result;
	}
		
	public static float sum(float[][] values)
	{
		float result = 0;
		
		for(float[] row : values)
		{
			for(float value : row)
			{
				result += value;
			}
		}
		
		return result;
	}
	
	public static int findA(String[][] values)
	{
		int result = 0;
		
		for(String[] row : values)
		{
			for(String value : row)
			{
				if(value.substring(0,1).equals("A") || (value.substring(0,1).equals("a")))
				{
					result++;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		int[][] smallest = {
			{8,2,3,4,5},
			{5,8,9,3,3},
			{1,4,4,3,7}
		};
		
		float[][] sum = {
			{3,4,2,3,7},
			{2,5,0,4},
			{6,7,6,7,2}
		};
		
		String[][] findA = {
			{"Sarah", "Arabella", "Sofia"},
			{"Elissa", "Adison", "Ally"},
			{"Alexis", "Kira"}
		};
		
		System.out.println("Smallest integer " + smallest(smallest));
		System.out.println("Sum of floats " + sum(sum));
		System.out.println("Number of A's " + findA(findA));
	}
}
