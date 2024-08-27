    public class Palindrome {
    
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
        
        System.out.println();    
         

    }
}
