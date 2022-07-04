class A
{
        A(){System.out.println("hi");}
        int a;
}
abstract class B
{
         B(){}
         int b;
}
interface I
{
         int x=100;
}
interface J
{
         
}
interface K extends J,I
{
         
}
class Demo4
{
     public static void main(String args[])
     {
         A c=new A();
         
     }
}