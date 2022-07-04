class A
{
      
      void abc()
      {
          System.out.println("hey a ");
      
      }
      
      
}
class B extends A
{
      
      void abc()
      {
          System.out.println("hi b");
      
      }
      
      
}

class Demo2
{
   public static void main(String args[])
   {
          B a=new B();
          a.abc();
          
   }

}