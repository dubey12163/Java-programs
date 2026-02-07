package numberPrograme;

public class FibonacciSeries {

	public static void main(String[] args) {
Result obj= new Result();
obj.m1();


}
}
class Result{
	int n1=0,n2=1,count=10,n3;
	void m1() {
	System.out.print(n1+" "+n2);
	for(int i=0;i<count-2;++i) {
	n3=n1+n2;
	System.out.print(" "+n3);
	n1=n2;
	n2=n3;
		}
	}
}