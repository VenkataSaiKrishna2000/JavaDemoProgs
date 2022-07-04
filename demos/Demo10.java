
class A
{
	
	A()
	{	
	   for(int i=0;i<=10;i++)
         {
	       if(i==5)
              {
                  continue;          
               }
             System.out.println(i);
          }
          System.out.println("while demo");
          int j=1;
          while(j<10)
          {
            System.out.println(j);
            j++;
          }
          int k=2;
          do
          {
            System.out.println(k);
            k++;
          }while(k<10);
	}
}
class Demo10
{
	public static void main(String args[])
	{
		A a =new A();
	}

}