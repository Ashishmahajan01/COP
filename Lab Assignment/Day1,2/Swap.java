import java.util.*;
class Swap{
	int x,y;
	public void acceptNumber(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter x:");
		x = sc.nextInt();
		System.out.println("Enter y:");
		y = sc.nextInt();
		
		
	}
	public void swapNumber(){
		int temp = x;
		x = y;
		y = temp;
		System.out.println("new x:" + x);
		System.out.println("new y:" + y);
		
	}
	public static void main(String [] args){
		Swap a = new Swap();
		a.acceptNumber();
		a.swapNumber();
		
		
	}
}