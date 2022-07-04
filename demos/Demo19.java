class Demo19 extends Thread
{
    public static void main(String args[])
    {
         String name1="suresh";
         String name2="sai";
         String name3="suresh";
         String name4=new String("suresh");
         String name5=new String("suresh");

         System.out.println(name1==name2);
         System.out.println(name1==name3);
         System.out.println(name1==name4);
         System.out.println(name1==name5);
         System.out.println(name4==name5);
         System.out.println(name5.equals(name1));
    }
}