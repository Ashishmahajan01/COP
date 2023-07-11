import java.util.*;
import java.lang.*;
class Amstrong{
	int num,last=0,temp,power = 0;
	double sum=0;
	public void acceptNumber(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number: ");
		num = sc.nextInt();		
	}
	public void amstrongLogic(){
		temp = num;
		while(temp> 0){
			temp = temp/10;
			power++;		
		}
		temp =num;
		while(temp>0){
			last=temp%10;
			sum = sum +(Math.pow(last,power));
			temp = temp/10;
		}
		if(sum == num)
			System.out.println("Number is Amstrong: ");
		else
			System.out.println("Number is not Amstrong: ");
		 
		 }		
	public static void main(String [] args){
		Amstrong a = new Amstrong();
		a.acceptNumber();
		a.amstrongLogic();
	}	
	
}