import java.util.*;
class Claculator{
	int a,b;
	Scanner sc = new Scanner (System.in);
	public void acceptData()
	{
		System.out.println("Enter 1 number: ");
		a = sc.nextInt();
		System.out.println("Enter 2 number: ");
		b = sc.nextInt();
		
		
	}
	public void addition()
	{
		System.out.println(a+b);
		
	}
	public void substraction()
	{
		System.out.println(a-b);
	}
	public void division()
	{
		System.out.println(a/b);
	}
	public void multiplication()
	{
		System.out.println(a*b);
	}
	public static void main(String [] args)
	{
		Claculator a = new Claculator();
		a.acceptData();
		System.out.println("1.Addition \n 2.substraction \n 3.Division \n 4.Multiplication \n");
		System.out.println("Enter your Choice :");
		Scanner sc = new Scanner (System.in);
		int choice = sc.nextInt();
		switch(choice){
			case 1 :
				a.addition();
				break;
			case 2 :
				a.substraction();
				break;
			case 3 :
				a.division();
				break;
			case 4 :
				a.multiplication();
				break;
			default:
				System.out.println("Enter correct choice: ");
		}
	}	
	
}