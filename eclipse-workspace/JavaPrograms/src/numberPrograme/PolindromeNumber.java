package numberPrograme;

public class PolindromeNumber {

	public static void main(String[] args) {
		int num1=12321;
		int temp=num1;
		int rem=0;
		int num2=0;
		while(num1>0) {
			rem=num1%10;
			num2=num2*10+rem;
			num1=num1/10;
		}
		if(temp==num2) {
			System.out.println("given number is polindrom");
			
		}else 
			System.out.println("Given number is not Polindrom");

	}

}
