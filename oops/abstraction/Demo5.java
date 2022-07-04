interface I
{
     int x=100;
     void add();
     void sub();

}
interface J
{
      int y=200;
      void mul();
      void div();
}
interface K extends I,J
{

}
class Cal implements K
{
     public void add(){System.out.println(I.x+J.y);}
     public void sub(){System.out.println(I.x-J.y);}
     public void mul(){System.out.println(I.x*J.y);}
     public void div(){System.out.println(I.x/J.y);}

}
class Demo5
{
      public static void main(String args[])
      {
          Cal c=new Cal();
          System.out.println("**************I*************");
          I i=c;
          i.add();
          i.sub();
          System.out.println("**************J*************");
          J j=c;
          j.mul();
          j.div();
          System.out.println("**************k*************");
          K k=c;
          k.mul();
          k.div();
          k.add();
          k.sub();
          System.out.println("accessing using normal class");
          c.mul();
          c.div();
          c.add();
          c.sub();
          
          
      }
}