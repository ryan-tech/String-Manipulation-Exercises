import java.util.Scanner;
class Palindrome {
    public static void main(String args[]) {
        /*
        - Ask User to enter a word or create a String variable and assign a word to it
        - Reverse a String and check if string in Palindrome
        */
        String userInput;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string.");
        userInput = myObj.nextLine();
        String reverseString = new StringBuilder(userInput).reverse().toString();
        if(reverseString.equals(userInput)) {
            System.out.println("String is a palindrome.");
        }
        else {
            System.out.println("String is NOT a palindrome.");
        }
    }
}