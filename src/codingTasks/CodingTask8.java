package codingTasks;

public class CodingTask8 {

	//Maximum and minimum number in the array?
	
	
	public static void main(String[] args) {
		
		
		int[] numbers= {45,50,77,85,90};
		
		int max=numbers[0];
		int min=numbers[0];
		
		for(int i=0; i<numbers.length;i++) {
			
			if(numbers[i]>max) {
				max=numbers[i];
			}else if(numbers[i]<min) {
				min=numbers[i];
			}
			
			
		}System.out.println("The maximum number is "+max+" and the minimum number is "+min+".");
		
		
		
		
		
	}
	
	
}
