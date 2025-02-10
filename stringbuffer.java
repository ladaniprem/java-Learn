public class stringbuffer {
    public static void main(String[] args) {
        // Create StringBuffer with default string
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original string: " + sb);
        
        // Append string at the end
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        // Insert string at position 5
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb);
        
        // Reverse the string
        StringBuffer reversed = new StringBuffer(sb);
        reversed.reverse();
        System.out.println("Reversed string: " + reversed);
    }
}
