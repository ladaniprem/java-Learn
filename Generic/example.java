public class example {
    public static void main(String[] args) {
        // Box B1 = new Box("water");
        // Box B2 = new Box(10);
        //  box.container =100;
        // System.out.println(B1.getvalue());
        // System.out.println(B2.getvalue());

        Box<String> B = new Box<String>("wow this is a amazing box");
        System.out.println(B.getvalue());
        System.out.println(B.container.getClass().getName());

        Box<Integer> B1 = new Box<Integer>(120);
        System.out.println(B1.getvalue());
        System.out.println(B1.container.getClass().getName()); 

        B.container = "hello world";
        B1.container = 1000;
        // B1.container = "jeel patel"; Note :- Type mismatch: cannot convert from String to IntegerJava

        Box<Boolean> Box2  = new Box<>(true);
        System.out.println(Box2.getvalue());
        B.performsomeTask();
        B1.performsomeTask();
    }
}
