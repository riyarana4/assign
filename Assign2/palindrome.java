public class Palindrome {

    public static void main(String[] args) {

        int num = 121, reverse = 0, remainder, originalInteger;

        originalInteger = num;

        while( num != 0 )
        {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reverse)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}