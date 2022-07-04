package p1;

public class A {

	public int a=100;
	private int b=200;
	protected int c=300;
	          int d=400;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
class B extends A
{
	void display()
	{
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class C
{
	void display()
	{
		A a=new A();
		System.out.println(a.a);
		//System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}
