package codingTasks;

import java.util.Scanner;

public class CodingTask6 {

	//Write a java program to check whether a given number is prime or not?
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int a=0;
		String result="";
		
		System.out.println("Input any number to see if it is a prime number");
		a=input.nextInt();
		
		for(int i=2; i<=a/2;i++) {
			if(a%i==0) {
				result= a+" is not a prime number.";
				break;
			}else if(a%i!=0) {
				
				result=a+" is a prime number.";
			}
			
		}System.out.println(result);
		
		
		
	}
	
	
	
	
	
}
