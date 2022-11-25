package Revisedproblems;

public class colouroutput1 {
public static void main(String[] args) {
	String b="\u001B[32m";
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(b+"*");
		}
		System.out.println();
	}
}
}
