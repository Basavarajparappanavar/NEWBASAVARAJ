package Revisedproblems;

public class method_2 extends method1{
	int a=20;
	
	static{
		System.out.println("coke");
	}
 void method1(){
		System.out.println("byee");
	}
 static void apple() {
	 System.out.println("hellow");
 }
 public static void main(String[] args) {
	method1 a1=new method_2();
	a1.method1();
	System.out.println(a1.a);
	a1.apple();
	method_2 b1=(method_2)a1;
	b1.apple();
	b1.method1();
	System.out.println(b1.a);
	method_2 c1=new method_2();
		
}

}
