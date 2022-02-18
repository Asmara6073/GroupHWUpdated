package codingTasks;

import java.util.Scanner;

public class CodingTask1 {

	/*
	 * Create an array on int values using a scanner 
	 * and calculate the sum of all stored elements in that array.
	 */
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the length of your array");
		
		int size=input.nextInt();
		int [] nums=new int[size];
		int sum = 0;
		
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter an element");
			nums[i]=input.nextInt();
			sum+=nums[i];
		}System.out.println("The sum of all of your stored elements in this array is " +sum);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
