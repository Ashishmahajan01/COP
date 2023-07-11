import java.util.*;
class Factorial{
	double num;
	public void acceptNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
	}
	public void factor(){
		for(int i = num-1 ; i>0; i--){
			num = num*i;
			
		}
		System.out.print("Factorial is : " + num );
		
	}
	public static void main(String [] args){
		Factorial a = new Factorial();
		a.acceptNumber();
		a.factor();
		
	}
	
	
}