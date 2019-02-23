package polymorphism;

public class B extends A{
	public int a;

	public B() {
		super();
		this.a = 10;
	}
	
	public static void staticB(){
		staticA();
		System.out.println("static b()");
	
	}

	
	
}
