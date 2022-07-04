class MyEmp
{
    MyEmp()
     {
         System.out.println("hi constructor");
     
     }
     void display()
     {
         System.out.println("hi constructor");


     }

}
class Demo2{
     public static void main(String args[])
     {
          MyEmp e=new MyEmp();
          e.display();
          e.display();
          e.display();

     }

}