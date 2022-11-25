package Revisedproblems;

public class Strongnumber {
	public static void main(String[] args) {
		for(int c=1;c<=100000;c++) {
		int a=c;
		int sum=0;
		int temp=a;
		while(a!=0) {
			int reminder=a%10;
			int fact=1;
			for(int i=reminder;i>=1;i--) {
				fact*=i;
			}
			sum+=fact;
			a/=10;
		}
		if(sum==temp) {
			System.out.println(sum);
		}
	} 
	}
}
