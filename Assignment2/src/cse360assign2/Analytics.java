/*
 * Name: Saad Alhajeri
 * PIN = 12
 * Description: This class inherits the class OrderedIntList.
 * and find the mean, median, highest number, lowest number, 
 * and how many elements in the array.
 */
package cse360assign2;

public class Analytics extends OrderedIntList 
{
	/**
	 * This class finds the mean 
	 * @return the mean of the integer list as a double.
	 */
	public double mean() 
	{
	    double summation = 0;
	    
	    if (count == 0)
	    	summation = -1;
	    else 
	    {
	    	for (int index = 0; index < count; index++) 
	    		summation = summation + array[index];
	    
	    	summation = summation / count;
	    }
	    
	    return summation ;
	}
	
	/**
	 * this class finds the median
	 * @return the median of the integer list as an int.
	 */
	public int median()
	{
		int summation = 0;
		
		if (count == 0)
			summation = -1;
		else
			summation = (array[0] + array[count-1]) / 2;
		
		return summation;
	}
	
	/**
	 * this class finds the highest value
	 * @return the high value in the list.
	 */
	public int high()
	{
		int highest = array[0];
		
		if (count == 0)
			highest = -1;
		else
		{
			for(int index = 0; index < count; index++)
			{
				if (array[index] > highest)
					highest = array[index];
			}
		}
		
		return highest;
	}
	
	/**
	 * this class finds the lowest value
	 * @return the low value in the list.
	 */
	public int low()
	{
		int lowest = array[0];
		
		if (count == 0)
			lowest = -1;
		else	
		{
			for(int index = 0; index < count; index++)
			{
				if (array[index] < lowest)
					lowest = array[index];
			}
		}
		
		return lowest;
	}
	
	/**
	 * this class find how many integers in the array
	 * @return the number of integers in the list.
	 */
	public int numInts()
	{
		return count;
	}	
}