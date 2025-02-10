public class member {
      //member Inner  class (Non-static Inner class)
      int a=40;
      private int b =80;
      static int c = 60;
      class Innerexample{
              public void dosum(){
                System.out.println("Sum of the three number "+(a+b+c));
              }
      }
      public static void main(String[] args) {
         // outer object 
         member member = new member();

         //Inner object 
         member.Innerexample ob = member.new Innerexample();
         ob.dosum();

         // second method to write the outer object 
         member.Innerexample ob1= new member().new Innerexample();
         ob1.dosum();

      }
}
