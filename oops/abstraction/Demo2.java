abstract class A
{
     A()
     { 
            System.out.println("hi constructor abstract class");

     }
     abstract void abc();
}
abstract class B extends A
{
     
     void abc()
     { 
            System.out.println("hi overridden method in abstract childclass B");

     }
     abstract void xyz();
}
class C extends B
{
     
     void xyz()
     { 
            System.out.println("hi overridden method in childclass C");

     }
}

class Demo2
{
    public static void main(String args[])
     {
          C b=new C();
          b.xyz();
          b.abc();
     }   
}



 