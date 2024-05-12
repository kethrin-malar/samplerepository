package demointerface;

 interface I1{
	void print();

}
class c1 implements I1{
	public void print(){
		System.out.println("mr");
	}
}
class c2 implements I1{
	public void print(){
		System.out.println("mrs");
	}
}
class c3 implements I1{
	public void print(){
		System.out.println("ms");
	}
}

public class A1 {

	void print(I1 method){
		method.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 a = new A1();
		c1 obj = new  c1();
		c2 obj1 = new c2();
		c3 obj2 = new c3(); 
		a.print(obj);
		a.print(obj1);
		a.print(obj2);
	}

}







