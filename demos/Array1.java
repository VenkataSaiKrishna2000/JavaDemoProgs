class Array1
{
           public static void main(String args[])
           {
                    int  arr[]={1,56,2,3,4,5,58};
                    for(int i=0;i<arr.length;i++)
                    {
                           
                            System.out.println(arr[i]);
                     }
                     System.out.println("-===========");


                     int a[]=new int[5];
                     a[0]=10;
                     a[1]=10;
                     a[2]=22;
                     a[3]=30;
                     
                     for(int i=0;i<a.length;i++)
                     {   
                           System.out.println(a[i]);
                     }
                     System.out.println("=======For each=======");
              
                     for(int x:arr)
                     {
                           System.out.println(x);
                      }
                      System.out.println("================");
                      int ar[]={50,70,3,56,49,35,2};
                      int min=ar[0];
                      for(int i=0;i<ar.length;i++)
                      {
                             if(min>ar[i])
                              {
                                    min=ar[i];
                               }

                                
                       }
                       System.out.println("min:"+min);
            }
}