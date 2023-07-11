import java.util.*;
class Prime{
	int num;
	public void acceptNumber(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number: ");
		num = sc.nextInt();
	}
	public void checkPrime(){
		if(num==2){
			System.out.println("2 is Prime ");
		}
		for(int i =2 ;i<num;i++){
			if(num % i ==0){
				System.out.println(num + " is a not a prime number");
				break;
			}
			else{
				System.out.println(num + " is a prime number");
				break;
			}
		}
	}
	public static void main(String[] args){
			Prime a = new Prime();
			a.acceptNumber();
			a.checkPrime();
		} 
		
			
}