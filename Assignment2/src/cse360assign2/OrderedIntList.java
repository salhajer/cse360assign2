/*
 * Name: Saad Alhajeri
 * PIN = 12
 * Description: This class arranges the inserted values in an ascending order.
 */

package cse360assign2;
/**
 * 
 * @author Saad Alhajeri
 *
 */
public class OrderedIntList 
{
	protected int[] array;  
	protected int count; 
	
	OrderedIntList()
	{
		array = new int[10];
	}
	
	/**
	 * This will insert the value that is inputed in the array
	 * @param value The user's input
	 */
	public void insert(int value) 
	{
		if(count == array.length) 
			grow();
		
		if(count == 0)
		{
			array[0] = value;
			count = count + 1;
		}
		
		else
		{
			int secondIndex = 0;
			boolean found = false;
			int index = 0;
			
				while(!found && index < count )
				{
					if(value < array[index])
						found = true;
					
					else
					{
						index = index + 1;
						secondIndex = secondIndex + 1;
					} 		
				}			 
			
			for (index = count; index > secondIndex; index--) 
				array[index] = array[index - 1];
			
			array[secondIndex] = value; 
			count = count + 1;
		}
	}
	
	/**
	 * This function will expand the array to hold more values.
	 */
	protected void grow()
	{
		int []total = new int[count*2];
		
		for (int index = 0; index < count; index++ )
			total[index] = array[index];
		
		array = total;
	}
	
	/**
	 * This function will print out the values.
	 */
	public void print() 
	{
		int index = 0;
		
		while(index < count)
		{
			if (index %5 == 0) 
				System.out.println();
			
			System.out.print(array[index++] + "\t");
		}
		
		System.out.println();
	}
	
	private boolean debug(String decision)
	{
		boolean temporary = false;
				
		if (decision == "yes")
			temporary = true;
		
		else
			temporary = false;
		
		return temporary;
		
	}
}
