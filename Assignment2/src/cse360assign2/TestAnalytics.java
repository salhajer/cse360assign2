/*
 * Name: Saad Alhajeri
 * PIN = 12
 * Description: This class is to test the class Analytics.
 */

package cse360assign2;

/**
 * This class is to test the class Analytics
 * @author Saad Alhajeri
 *
 */
public class TestAnalytics 
{
	public static void main(String[] args) 
	{
		Analytics temporary = new Analytics();
		
		temporary.insert(5);
		temporary.insert(4);
		temporary.insert(2);
		temporary.insert(6);
		temporary.insert(3);
		temporary.insert(70);
		temporary.insert(10);
		temporary.insert(65);
		temporary.insert(22);
		
		temporary.print();
		
		System.out.println("The mean is: " + temporary.mean());
		System.out.println("The median is: " +temporary.median());
		System.out.println("The highest value is: " +temporary.high());
		System.out.println("The lowest value is: " +temporary.low());
		System.out.println("The array has: " +temporary.numInts() + " values");
	}
}