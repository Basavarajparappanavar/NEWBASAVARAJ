package Revisedproblems;

public class test {
	public static void main(String[] args) {
		String s1="1,2,23,4,55,556";int temp=0;
		int a[]= {1,1,1,2,2,3,3,4,4,5,5,6};
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]!=a[j]) {
					a[i]=a[j];
					temp=a[i];
				}

			}
			System.out.println(temp);
		}
		
			
			
		}
		
	}


