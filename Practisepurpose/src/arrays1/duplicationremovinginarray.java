package arrays1;

public class duplicationremovinginarray {
	public static void main(String[] args) {
		int a[]= {1,2,2,3,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[i]=a[j];
					System.out.println(a[j]);
			}
			
		}
	
		}
	}
	

}
