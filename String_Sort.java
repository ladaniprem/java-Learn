import java.util.Arrays;

public class String_Sort {
    public static void main(String[] args) {
        String name = "prem";
        
        // Convert string to char array for sorting
        char[] chars = name.toCharArray();
        Arrays.sort(chars);
        
        // Convert back to string and print
        String sortedName = new String(chars);
        System.out.println("Original string: " + name);
        System.out.println("Sorted string: " + sortedName);
    }
} 