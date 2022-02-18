package codingTasks;

public class CodingTask4 {
	
	/*
	 * Create a 2D array of integers. 
	 * Develop a program which will calculate the sum of  
	 * even and odd numbers for that array.
	 */

	public static void main(String[] args) {
		
		int evenSum=0;
		int oddSum=0;
		int[][] num= {
				
				{10,20,30,5},
				{6,8,7}
		};
		
		for(int i=0;i<num.length;i++) {
			for(int a=0;a<num[i].length;a++) {
				if(num[i][a]%2==0) {
					evenSum+=num[i][a];
				}else if(num[i][a]%2!=0) {
					oddSum+=num[i][a];
				}
			
		
				}
			
			}
		System.out.println(evenSum);
		System.out.println(oddSum);
		}
		
		
		
	}
	

