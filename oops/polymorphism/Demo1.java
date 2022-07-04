class A
{
      int a=100;
      A()
      {
          System.out.println("hi");
      
      }
      A(int a)
      {
          System.out.println(a);
      
      }
      A(int a,String name)
      {
          System.out.println(a+":"+name);
      
      }
      A(int a,int b,String name)
      {
          System.out.println("sum:"+(a+b)+name);
      
      }
      
      void sum(int a,int b,int c)
      {
          System.out.println("sum:"+(a+b+c));
      
      }
      void sum(int a,int b)
      {
          System.out.println("sum:"+(a+b));
      
      }
      
}
class Demo1
{
   public static void main(String args[])
   {
          A a=new A();
          A a1=new A(122);
          A a2=new A(10,"sai");
          A a3=new A(10,20,"sai");
          a.sum(10,20);
          a.sum(20,30,40);
          
   }

}