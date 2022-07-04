//final class cant be inherited
class A
{
     int a=100;
     int b=200;
     final void m1(){System.out.println("hi a");}
}
class B extends A
{
   final int b=500;
   //void m1(){System.out.println("hi B");}
}
class Demo12
{
    public static void main(String args[])
    {
        B b=new B();
        b.m1();
        System.out.println(b.b);
    }
}

/* variable cannot be changed if it is declared as final
method cant be override when it is declared final
class cannot be inherited when it is declared as final*/