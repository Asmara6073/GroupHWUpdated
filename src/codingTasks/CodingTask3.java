package codingTasks;

public class CodingTask3 {

	
	public static void main(String[] args) {
		
		String result="";
		int [][]num= {
				
				{10,11,12,13},
				{20,22,24}
			
		};
		for(int i=0;i<num.length;i++) {
			for(int a=0;a<num[i].length;a++) {
				if(num[i][a]%2==0) {
					result=num[i][a]+" is an even number.";
					
				}else if(num[i][a]%2!=0) {
					result=num[i][a]+" is an odd number.";
				}
				System.out.println(result);
			}
			
		}
		
	}
	
	
}
