import java.util.Scanner;
class A
{
     Scanner sc=new Scanner(System.in);
     A()
      {
       
        System.out.println("enter marks in telugu:");
        int t=sc.nextInt(); 
        System.out.println("enter marks in Englsh:");
        int e=sc.nextInt();
        System.out.println("enter marks in hindi:");
        int h=sc.nextInt(); 
        System.out.println("enter marks in maths:");
        int m=sc.nextInt();
        System.out.println("enter marks in Science:");
        int s=sc.nextInt(); 
        System.out.println("enter marks in social:");
        int ss=sc.nextInt(); 
        int total=t+e+h+m+s+ss;
        int per=total/6;
        
        System.out.println("average marks:"+per);

      }

}
class Average
{
   public static void main(String args[])
    {
          A o=new A();

    }

}