class A
{
    A()
    {
        this(10);
        System.out.println(" A ()");
    }
    A(int  a )
    {
        System.out.println(" A (int a )");
    }    
}

 

class Demo4
{    
    public static void main(String args[])
    {
    
        A a= new A();    
    }

 

}