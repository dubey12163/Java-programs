package stringProgram;

public class MaxAndMinChar {

	public static void main(String[] args) {
	String str="Auto generated method stub";
	str=str.toLowerCase();
	
	char [] str1=str.toCharArray();
	int []fqr=new int[str1.length];
	
	char maxchar=str1[0],minchar=str1[0];
	
	for(int i=0;i<str1.length;i++) {
		fqr[i]=1;
		for(int j=i+1;j<str1.length;j++) {
			if(str1[i]==str1[j]&&str1[i]!=' '&&str1[i]!='0') {
				fqr[i]++;
				str1[j]='0';
			}
		}
	}int max=fqr[0];
	int min=fqr[0];
	for(int i=1;i<fqr.length;i++) {
		if(fqr[i]>max) {
			max=fqr[i];
			maxchar=str1[i];
			
		}}
		for(int i=1;i<fqr.length;i++) {
			if(fqr[i]<min

					
					
					) {
				min=fqr[i];
				minchar=str1[i];
			}
	}System.out.println("maximum occaring character is:"+maxchar+"="+max);
	System.out.println("min occaring character is:"+minchar+"="+min);

	}

}
