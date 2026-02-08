package arrayPrograme;

public class LeftRoted {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int n=3;

	for(int i=0;i<n;i++) {
		for(int j=0;j<a.length-1;j++) {
			a[j]=a[j+1];
			System.out.print(a[j]);
		}
	}

	}

}
