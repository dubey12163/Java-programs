package numberPrograme;

public class NumberCount {

	public static void main(String[] args) {
		String s="F0S2S5I2L1";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				int b=Integer.parseInt(String.valueOf(s.charAt(i)));
				sum=sum+b;
			}
			
		}
		System.out.println("sum of digits in string is:"+sum);

	}

}
