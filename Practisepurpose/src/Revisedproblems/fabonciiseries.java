package Revisedproblems;

public class fabonciiseries {
	public static void main(String[] args) {
		int a,b,sum;
		a=0;b=1;sum=0;
	for(int i=0;i<=8;i++) {
		if(i==0||i==1) {
			System.out.print(i);
		}
		else {
			sum=a+b;
			System.out.print(sum);
			a=b;
			b=sum;
		}
	}
	}
}
