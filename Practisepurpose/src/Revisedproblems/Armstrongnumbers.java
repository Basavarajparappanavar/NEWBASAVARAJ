package Revisedproblems;

import java.util.Scanner;

public class Armstrongnumbers {
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("ENTER THE RANGE BOSS");
		int start=a1.nextInt();int end=a1.nextInt();
		for(int j=start;j<=end;j++) {
		int num=j;
		int temp=num;
		int actualnum=num;
		int count=0;
		int sum=0;
		for(int i=0;num!=0;i++) {
			count++;
			num/=10;
		}
		for(int i=0;temp!=0;i++) {
			int reminder=temp%10;
			sum=sum+(int)Math.pow(reminder, count);
			temp/=10;
		}
		if(sum==actualnum) {
			System.out.println(sum);
		}
	}
	}
}
