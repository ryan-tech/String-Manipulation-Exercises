import java.util.*;

class Consonants {

    public static int countConsonants(String s) {
        String lowercase = s.toLowerCase();
        int consonantCount = 0;
        for(int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            // consonant is a letter that is not a vowel
            if(Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                consonantCount++;
            }
        }
        return consonantCount;
    }

    public static void main(String args[]) {
        /*
- Ask User to enter a sentence or create a String variable to assign a sentence to it
- Count all consonants in a String and display the count
- Replace all consonants with '*' in a String
        */
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string.");
        String userInput = myObj.nextLine();

        int consonantCount = countConsonants(userInput);
        System.out.println("The number of consonants is " + consonantCount);

        String lowercase = userInput.toLowerCase();
        for(int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            if(Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                // replace the consonant
                userInput = userInput.substring(0,i) + "*" + userInput.substring(i+1);
            }
        }
        System.out.println("The updated string is:");
        System.out.println(userInput);
    }
}