import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Basic string replacement
        String str = "Hello World! Hello Java!";
        System.out.println("Original string: " + str);
        
        // Using replace() - replaces all occurrences
        String replaced1 = str.replace("Hello", "Hi");
        System.out.println("After replace(): " + replaced1);
        
        // Using replaceAll() with regex
        String str2 = "Hello123World456";
        String replaced2 = str2.replaceAll("\\d+", "-");
        System.out.println("\nReplacing numbers with regex:");
        System.out.println("Original: " + str2);
        System.out.println("After replaceAll(): " + replaced2);
        
        // User input replacement
        System.out.print("\nEnter a sentence: ");
        String userStr = sc.nextLine();
        System.out.print("Enter text to replace: ");
        String oldText = sc.nextLine();
        System.out.print("Enter new text: ");
        String newText = sc.nextLine();
        
        String result = userStr.replace(oldText, newText);
        System.out.println("Result: " + result);
        
        sc.close();
    }
}