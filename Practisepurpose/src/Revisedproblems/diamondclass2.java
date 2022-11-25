package Revisedproblems;

public class diamondclass2 extends diamondcutclass implements diamondcut1,diamondcut {
	public void mult() {
		System.out.println("byee");
	}
public void div() {
	System.out.println("bubyee");
}
public void add() {
	System.out.println("bye");
}
public static void main(String[] args) {
	diamondclass2 a1=new diamondclass2();
	a1.add();
	a1.sub();
	a1.div();
	a1.mult();
}
}
