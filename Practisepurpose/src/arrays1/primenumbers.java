package arrays1;

public class primenumbers {
	public static void main(String[] args) {
		for(int j=1;j<=100;j++) {
	int a=j;boolean flag=true;
	for(int i=2;i<a/2;i++) {
	if(a%i==0) {
		flag=false;
		break;
	}
	}
	if(flag==true) {
		System.out.println(a);
	}
	}
	}
}
