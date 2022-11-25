package arrays1;

public class array2 {
	public static void main(String[] args) {
	int b[]= {5,6,7,1,2,0};
	for(int i=0;i<b.length;i++) {
		for(int j=1+i;j<b.length;j++) {
			if(b[i]>b[j]) {
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	for(int j=0;j<b.length;j++) {
		System.out.println("Array values after sorting");
		System.out.println(b[j]);
	}
	int largest=b[b.length-1];
	int smallest=b[1];
	int add=largest+smallest;
	System.out.println(add);
		
	}
	

}
