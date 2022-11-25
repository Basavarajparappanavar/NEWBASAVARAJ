package Revisedproblems;

import java.util.Scanner;

public class Palindromenumber {
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("ENTER THE RANGE BOSS");
		int start=a1.nextInt();int end=a1.nextInt();
		for(int j=start;j<=end;j++) {
		int num=j;
		int reverse=0;
		int temp=num;
		while(num!=0) {
			int reminder=num%10;
			reverse=(reverse*10)+reminder;
			num/=10;
		}
		if(reverse==temp) {
			System.out.println(reverse);
		}
		}
		
	}
	

}
