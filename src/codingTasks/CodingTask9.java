package codingTasks;

public class CodingTask9 {

	//Write a java program to find the second largest number in the array?
	
	
	public static void main(String[] args) {
		
		
		
		int []numbers= {55,60,75,85,90,95};
		int largest=numbers[0];
		int secondLargest=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				secondLargest=largest;
				largest=numbers[i];
			}else if(numbers[i]>secondLargest) {
				secondLargest=numbers[i];
			}
			
		}System.out.println("The second largest number is "+secondLargest+".");
		
		
		
		
	}
	
	
}
