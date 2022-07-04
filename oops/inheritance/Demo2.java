class A
{
    A()
    {
        System.out.println(" A  class ");
    }
}
class B   extends A
{
    B()
    {
        System.out.println(" B class ");
    }
}
class Demo2
{
     public static void main(String args[])
    {
        B b = new B();   
    }
}