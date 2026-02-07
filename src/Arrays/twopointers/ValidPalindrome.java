package Arrays.twopointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters (convert to lowercase)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Test case 1: Classic palindrome with spaces and punctuation
        String test1 = "A man, a plan, a canal: Panama";
        System.out.println("\"" + test1 + "\" is palindrome: " + solution.isPalindrome(test1));

        // Test case 2: Not a palindrome
        String test2 = "race a car";
        System.out.println("\"" + test2 + "\" is palindrome: " + solution.isPalindrome(test2));

        // Test case 3: Empty or single space
        String test3 = " ";
        System.out.println("\"" + test3 + "\" is palindrome: " + solution.isPalindrome(test3));

        // Test case 4: Single character
        String test4 = "a";
        System.out.println("\"" + test4 + "\" is palindrome: " + solution.isPalindrome(test4));

        // Test case 5: Mixed case
        String test5 = "RaceCar";
        System.out.println("\"" + test5 + "\" is palindrome: " + solution.isPalindrome(test5));
    }

}
