import java.util.*;
class Range4 {
	int num;
	public void acceptNumber(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Range: ");
		num = sc.nextInt();
		
	}
	public void primeNumber(){
		for(int i = 0; i <= num ; i++){
			if(i %2==0){
				System.out.print(i + " ");
				
			}
		}
	}
	
	
	public static void main(String [] args){
		Range a = new Range();
		a.acceptNumber();
		a.primeNumber();
	
	}
	
	
	
	
	
}