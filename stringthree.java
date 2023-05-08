public class stringthree {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Calculate the length of a string
        int length1 = str1.length();
        int length2 = str2.length();
        
        System.out.println("Length of str1: " + length1);
        System.out.println("Length of str2: " + length2);
        
        // Compare between strings
        boolean areEqual = str1.equals(str2);
        System.out.println("Strings are equal: " + areEqual);
        
        // Concatenating strings
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenated);
    }
}