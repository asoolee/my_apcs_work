
import java.util.*;

public class ArrayFib
{
	public static ArrayList<Integer> arrayFib(int n)
	{
		// im goigng tocry.java
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int a = 0;
		int b = 1;
		
		for(int i = 0; i < n; i++)
		{
			int c = a+b;
			result.add(c);
			a = b;
			b = c;
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		int value = 10;
        
        ArrayList<Integer> fib = arrayFib(value);
         System.out.print("filtered: ");
        for (int f : fib)
            System.out.print(f + " ");
        System.out.println();

	}
}
