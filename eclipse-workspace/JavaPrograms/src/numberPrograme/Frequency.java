package numberPrograme;

public class Frequency {

	public static void main(String[] args) {
		int []a= {2,5,2,4,3,5,2,4};
		int fq[]=new int[a.length];
		
		for(int i=0;i<fq.length;i++) {
			fq[i]=1;
			for(int j=i+1;j<fq.length;j++) {
				if(a[i]==a[j]) {
					fq[i]++;
					a[j]=-1;
				}
			}
		}for(int i=0;i<fq.length;i++) {
			
		if(a[i]!=-1) {
		System.out.println(a[i]+":"+fq[i]);
		}     	
	}

}
}
