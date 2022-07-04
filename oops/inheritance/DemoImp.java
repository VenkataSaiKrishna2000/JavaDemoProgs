class A
{
    int a=5;
}
class B extends A
{
      int a=100;
      B(int a)
      {
           System.out.println("A:"+a);
           System.out.println("A:"+this.a);
           System.out.println("A:"+super.a);
      }

}
class DemoImp
{
     public static void main(String args[])
     {

           B b=new B(111);

     }


}

//super//base//parent class
//sub//derived//child class