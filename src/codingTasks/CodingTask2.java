package codingTasks;

public class CodingTask2 {
	
	
	//Create a 2D array of integer values. Print the sum of all numbers.
	
	
	public static void main(String[] args) {
		int sum = 0;
		int num[][]= {
				
				{10,15,20,25},
				{30,35,40},
				{45,50}
						
		};
		
		for(int i=0; i<num.length;i++){// when used with 2D array gives # of 1d Arrays(Rows)
			for(int a=0; a<num[i].length;a++) {
				sum+=num[i][a]; 
				
			}
			
			
		}
		
		System.out.println(sum);
		
		
		
	}
	

}
