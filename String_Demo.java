public class String_Demo {
    public static void main(String[] args) {

        String name = "prem";
        System.out.println("Name: " + name);
        
        String firstTwo = name.substring(0, 2);
        System.out.println("First two letters: " + firstTwo);
        
  
        String lastTwo = name.substring(2);
        System.out.println("Last two letters: " + lastTwo);
    }
}