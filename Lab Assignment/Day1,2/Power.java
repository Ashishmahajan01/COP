import java.util.*;
class Power{
	int m,n;
	public void acceptNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		m = sc.nextInt();
		System.out.println("Enter number power: ");
		n = sc.nextInt();	
		
	}
	public void powerofnumber(){
		int ans = m;
		for(int i=1; i<n; i++){
			ans = ans*m;
		}
		System.out.println("Answer is: " + ans);
		
	}
	public static void main(String [] args){
		Power a = new Power();
		a.acceptNumber();
		a.powerofnumber();
	}
	
	
	
	
}