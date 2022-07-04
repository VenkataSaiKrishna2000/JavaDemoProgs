class A
{
     A()
     { 
            System.out.println("hi constructor normal class");

     }
     void abc()
     { 
            System.out.println("hi method normal class");

     }
}
abstract class B
{
     B()
     { 
            System.out.println("hi constructor abstract class");

     }
     abstract void abc();
     void xyz()
     { 
            System.out.println("hi method normal class");

     }
}
class Demo1
{
    public static void main(String args[])
     {
          A a=new A();
          a.abc();
     }   
}



 //       class                       Abstract 
// obj    A a=new A();                  no object
//        only have non abstract      can have both
//           methods
//   abstract void abc();
//               hiding the implementation
                    