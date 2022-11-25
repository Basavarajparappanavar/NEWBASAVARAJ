package Revisedproblems;

public class specialnum {
	public static void main(String[]args) {
		for(int i=1;i<=100;i++) {
	int a=i;
	int a1=a%10;
	int a2=a/10;
	int sum=a1+a2;
	int product=a1*a2;
	int specialnum=sum+product;
	System.out.println(specialnum);
	if(a==specialnum) {
		System.out.println("it is special");
	}
	else {
		System.out.println("not");
	}
		
	}
	
	}
}
