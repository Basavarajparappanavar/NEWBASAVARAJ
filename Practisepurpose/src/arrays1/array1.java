package arrays1;

public class array1 {
	public static void main(String[] args) {
		int sum=0;
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=i;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
			System.out.println(a[i]+"values are");
		}
		System.out.println(sum+"sum is");
		
	}

}
