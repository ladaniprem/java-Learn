public class Outer {

    static int a=30;
    // int b =100;
    public static void display(){
        System.out.println(a);
    }
    //static inner class 
    //access it outer : static variables : access it
    //static class cannot access non static variables and methods of outer class directly
    //To do so create object of outer class.
    static class inner{
            inner(){
                System.out.println("This is a inner constructor..");
                System.out.println("value of a from the inner class "+a);
               // System.out.println(b);//Cannot make a static reference to the non-static field b
            }
    }
    public static void main(String[] args) {
        System.out.println(Outer.a);
        Outer.display();

        //static inner class object syntex:-
        //outclass.innerclass variable = new Outerclass.innerclass();

      //  Outer.inner ob = new Outer.inner(); //genral method 
        // inner t = new inner();//a tabi call hoga jab apka main method usi class me ho jesme static inner class ho.
        //in short jesme both main and static inner class ho .
    }
    }