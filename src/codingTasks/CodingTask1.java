package codingTasks;

import java.util.Scanner;

public class CodingTask1 {

	/*
	 * Create an array on int values using a scanner 
	 * and calculate the sum of all stored elements in that array.
	 */
	/*	1)Take the size of the Array using scanner class from the user
	 *  2)Create an int array of the above size
	 *  3)Fill the arrray with elements from the user using scanner class
	 *  4)Sum all the elements of the array
	 *  
	 */
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		// prompt the user for the size of Array
		System.out.println("Please enter the length of your array");
		// take the size from the user and store it in the size variable
		int size=input.nextInt();
		//create an int array of above size
		int [] nums=new int[size];
		// fill the array with elements from the user using scanner class
		int sum = 0;
		
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter an element");
			nums[i]=input.nextInt();
			sum+=nums[i];
		}System.out.println("The sum of all of your stored elements in this array is " +sum);
		
		
		//System.out.printn(Arrays.toString(array));// prints out the elements of an array with out loops
		
		
		
		
		
	}
	
	
	
	
	
}
