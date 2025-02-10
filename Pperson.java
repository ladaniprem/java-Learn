public class Pperson {
    public void showdetails(){
        System.out.println("Basic detail of person");
    }
}

class Emp extends Pperson{
    @Override
      public void showdetails(){
         System.out.println("showing the detail of the employee");
      }
}