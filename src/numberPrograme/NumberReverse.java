package numberPrograme;

public class NumberReverse {

	public static void main(String[] args) {
	int num=987215;
	int reverse=0;
	int reminder=0;
	while(num!=0) {
		reminder=num%10;
		reverse=reverse*10+reminder;
		num=num/10;
	}
	System.out.println(reverse);

	}

}
