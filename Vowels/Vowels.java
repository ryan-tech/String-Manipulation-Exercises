import java.util.Scanner;

class Vowels {
    public static int countVowels(String s) {
        String lowercase = s.toLowerCase();
        int vowelCount = 0;
        for(int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            //System.out.println(c);
            if(Character.isLetter(c) && (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        /*
        1. Create Vowels class in JAVA then do the following:
        - Ask User to enter a sentence or create a String variable to assign a sentence to it
        - Count all the vowels in a sentence and display the count
        */
        String userInput;
        // prompt a user input
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        userInput = myObj.nextLine();
        int vowelCount = countVowels(userInput);
        System.out.println("The number of vowels in this sentence is: " + vowelCount);
    }
}