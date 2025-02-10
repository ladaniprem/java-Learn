public class Nested {
     
    // Nested classes

    //The programming language allows you to define a class within another class .
    //such a class is called a nested class.

      //advatages :-

    //1. It is a way to logical Grouping classes that are only used in one place .

    //2. It can lead to more readable and maintainable code.

     
     /*private */ class Inner{  //It increases Encapsulation 
        String city = "Rajkot";

        public void showcity(){

            System.out.println(" City is "+city);
        }

      }
    int a = 77;
    static String name = "Indus University";
    public void displayA(){
        System.out.println(a);
    }
}
