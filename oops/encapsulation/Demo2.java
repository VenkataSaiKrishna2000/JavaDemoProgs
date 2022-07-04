class Emp
{
      private int id;
      private String name;
      void setid(int id)
      {
          this.id=id;
}
      int getid()
      {
          return id;
}
      void setname(String name)
      {
          this.name=name;
}
      String getname()
      {
          return name;
}
}
class Demo2
{
   public static void main(String args[])
     {
         Emp e=new Emp();
         e.setid(20);
         System.out.println(e.getid());
         e.setname("sai");
         System.out.println(e.getname());
         System.out.println("Id:"+e.getid()+"\nName:"+e.getname());
}
}