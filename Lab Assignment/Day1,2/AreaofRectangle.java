import java.util.*;
class AreaofRectangle{
	int l,m;
	public void acceptNumber(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter rectangle side 1 size: ");
		l=sc.nextInt();
		System.out.println("Enter rectangle side 2 size: ");
		m=sc.nextInt();
	}
	public void areaofrectangle(){
		int ans = l*m;
		System.out.println("Area of rectangle is: " + ans);
	}
	public static void main(String [] args){
		AreaofRectangle a = new AreaofRectangle();
		a.acceptNumber();
		a.areaofrectangle();
		
	}
}