import java.util.Scanner;
class A
{
     Scanner sc=new Scanner(System.in);
     A()
      {
        System.out.println("enter the name:");
        String name=sc.next();
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
        if(per>=85)
         {
           System.out.println("Hi:"+name+"Your marks are:"+total+"and percentage :"+per+"distinction");
         }
         else if(per>60 && per<85)
         {
            System.out.println("Hi:"+name+"Your marks are:"+total+"and percentage :"+per+"first class");      
          }
         else if(per>50 && per<60)
         {
            System.out.println("Hi:"+name+"Your marks are:"+total+"and percentage :"+per+"second class");      
          }
         else if(per>35 && per<50)
         {
            System.out.println("Hi:"+name+"Your marks are:"+total+"and percentage :"+per+"third class");      
          }
          else 
         {
            System.out.println("Hi:"+name+"Your marks are:"+total+"and percentage :"+per+"fail");      
          }


      }

}
class Marks
{
   public static void main(String args[])
    {
          A o=new A();

    }

}