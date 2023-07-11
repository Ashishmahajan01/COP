import java.util.*;
class Palindrome{
	int num;
	public void setNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num =sc.nextInt();
		
	}
	public void setPalindrome{
		int r = 0;
		int sum = 0;
		
		while(num>0){
            r = num%10;
            sum = (sum*10) + r;
            num =num/10;
        }
        if(temp == sum) {
            System.out.println("Number is palindrome: ");
        }
        else{
            System.out.println("Number is not palindrome:");
		}
		
		
	}
	public static void main(String [] args){
		Palindrome a = new Palindrome();
		a.setNumber();
		a.setPalindrome();
	}	
}