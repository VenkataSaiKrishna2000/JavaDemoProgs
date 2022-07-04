class A
{
     static void sai()
       {
          System.out.println("sai it is static method");

}
}
class B
{
     void abc()
       {
          System.out.println("hello normal method");

}
}
class Demo1
{
     public static void main(String args[])
        {
               B b=new B();
               b.abc();
               A.sai();
}
}