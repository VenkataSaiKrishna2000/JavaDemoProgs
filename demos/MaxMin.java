import java.util.scanner;
class Examp
{
   System.out.println("Enter the three numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c)
            System.out.println("Max value is "+a);
        else if(b>c)
            System.out.println("max value"+b);
        else    
            System.out.println("max value is "+c);
        if(a<b&&a<c)
            System.out.println("min value is"+a);
        else if(b<c)
            System.out.println("min value"+b);
        else
            System.out.println("min value"+c);


}

class MaxMin 
{
   public static void main(String args[])
   {
      Examp e=new Examp();
   }
}