import java.util.*;
import java.lang.*;
class CompoundIntrest{
	double p,r,n,t,a;
	public void setNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Intrest:");
		p = sc.nextDouble();
		System.out.println("Enter Intrest Rate:");
		r = sc.nextDouble();
		System.out.println("Enter Time periods elapsed:");
		t = sc.nextDouble();
	}
	public void setIntrestLogic(){
		//A= p(1+r/100)^t Formula;
		double x = (1+(r/100));
        double y = p*x;
        a = Math.pow(x, t);
		System.out.println("Compound Intrest = " + ((a*p)-p) );
	}
	public static void main(String [] args){
		CompoundIntrest a = new CompoundIntrest();
		a.setNumber();
		a.setIntrestLogic();
	}
}