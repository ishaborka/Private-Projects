/*
 * Palindrome.java
 *
 * Computer Science 112
 *
 * Modifications and additions by:
 *     name: Jennifer Alonzo Moreno
 *     username:
 */
   
 public class Palindrome {
    // Add your definition of isPal here.
    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    
    public static boolean isPal(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }

        LLStack<Character> stack = new LLStack<>();
        
        String formattedStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isLetter(c)) {
                c = Character.toLowerCase(c);
                formattedStr += c;
                stack.push(c);
            }
        }

        for (int i = 0; i < formattedStr.length(); i++) {
            char c = formattedStr.charAt(i);
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(0) Testing on \"A man, a plan, a canal, Panama!\"");
        try {
            boolean results = isPal("A man, a plan, a canal, Panama!");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();    // include a blank line between tests
        
        /*
         * Add five more unit tests that test a variety of different
         * cases. Follow the same format that we have used above.
         */

        System.out.println("(1) Testing on \"Do Geese? See God?\"");
        try {
            boolean results = isPal("Do Geese? See God");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();    // include a blank line between tests
        
        System.out.println("(2) Testing on \"This is not a palindrome.\"");
        try {
            boolean results = isPal("This is not a palindrome.");
            boolean expected = false;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println(); 

        System.out.println("(3) Testing on \"j\"");
        try {
            boolean results = isPal("j");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println(); 

        System.out.println("(4) Testing on \"Ra@ts Live %on no *evIl stAr#\"");
        try {
            boolean results = isPal("Ra@ts Live %on no *evIl stAr#");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println(); 
        System.out.println("(5) Testing on \"jennifer and isha\"");
        try {
            boolean results = isPal("jennifer and isha");
            boolean expected = false;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println(); 

    }
}