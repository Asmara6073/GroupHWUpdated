package codingTasks;

public class CodingTask7 {

	//Write a Java Program to print the first 10 numbers of Fibonacci series.
	
	public static void main(String[] args) {
		
		
		int firstTerm=0;
		int secondTerm=1;
		int lastTerm=0;
		
		
		for(int i=0; i<10; i++) {
			
			System.out.print(firstTerm+", ");
			
			lastTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=lastTerm;
		}
		
		
		
		
	}
	
	
}
