package Revisedproblems;

public class pattern10 {
public static void main(String[] args) {
	int c=1;char B='A';
	for(int a=1;a<=6;a++) {
		for(int d=1;d<a;d++) {
		System.out.print(c++);
		}
	for(int b=a;b==a;b++) {
		System.out.print("@");
	}
	for(int b=a;b<=5;b++) {
		System.out.print(B++);
	}
	System.out.println();
	c=1;
	B='A';
	}
	
}
}
