import java.util.Scanner;
class Interest
{
public static void main(String args[])    
{
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of p:");
      double p=sc.nextDouble();
      System.out.println("enter the value of T:");
      int t=sc.nextInt();
      System.out.println("enter the value of R:");
      float r=sc.nextFloat();
      System.out.println("value of p:"+p);
      System.out.println("value of t:"+t);
      System.out.println("value of r:"+r);
      Double i=(p*t*r)/100;
      System.out.println("Simple interest is "+i);
}

}