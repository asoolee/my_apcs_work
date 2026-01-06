import java.util.*;

public class FilterBadScores
{
	public static ArrayList<Double> filterBadScores(double[] values)
	{
		ArrayList<Double> filter = new ArrayList<Double>();
		
		for(double v : values)
		{
			if(v < 50)
			filter.add(v);
		}
		
		return filter;
	}
	
	public static void main(String[] args)
	{
		double[] values = {51, 49, 37, 100};

        System.out.print("values: ");
        for (double v : values)
            System.out.print(v + " ");
        System.out.println();
        
        ArrayList<Double> badValues = filterBadScores(values);
         System.out.print("filtered: ");
        for (double v : badValues)
            System.out.print(v + " ");
        System.out.println();

	}
}

