 package Revisedproblems;

public class perform_all_function2 extends peform_all_function1{
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
static {
System.out.println("namste for class 2 to class 1");	
}
{
System.out.println("");	
}
static void saturday() {
	 System.out.println("alone method2");
}
void buddy(int a) {
	 System.out.println("buddy of method2");
}
{
	 System.out.println("naanu ideni2");
}
static void apple() {
	 System.out.println("apple keeps doctor away2");
}
void apple(int b) {
	 System.out.println("edeli kalliddavng idellaa antalla"
	 		+ "2");
}
public static void main(String[] args) {
	peform_all_function1 a1=new peform_all_function1();
	a1.buddy(10);
	peform_all_function1.apple();
	perform_all_function2 a2=new perform_all_function2();
	a1=a2;
	a1.saturday();
	a1.buddy(10);
	perform_all_function2 a3=new perform_all_function2();
	a3=a2;
	a3.apple(5);
	a1=a3;
}
}
