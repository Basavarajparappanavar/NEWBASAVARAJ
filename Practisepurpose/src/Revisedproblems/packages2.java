package Revisedproblems;

public class packages2 extends packages1{
int a=20;
public static void main(String[] args) {
packages2 a1=new packages2();
System.out.println(a1.a);
packages1 a2=new packages1();
System.out.println(a2.a);
a2=a1;
System.out.println(a2.a);
System.out.println(a1.a);
}
}
