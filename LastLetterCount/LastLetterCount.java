import java.util.*;

/*
- Ask User to enter a sentence or create a String variable to assign a sentence to it
- Count all words that ends in 's' in a String and words that ends in 'y' in a String
- Switch the first instance of word that end with 's' and 'y'
- Display the new sentence where words are switched
 */

class LastLetterCount {
    public static void main(String[] args) {
        // store the first instance of each case
        int firstWordEndingWithS = -1;
        int firstWordEndingWithY = -1;
        // store number of each word ending with s or y
        int numWordsEndingWithS = 0;
        int numWordsEndingWithY = 0;

        // get the string
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string.");
        String userInput = myObj.nextLine();

        // split the string into words (array of strings)
        String words[] = userInput.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        // go through each word and check if last character is S or Y
        for(int i = 0; i < words.length; i++) {
            String wordLower = words[i].toLowerCase();
            System.out.println(words[i]);
            if(wordLower.charAt(wordLower.length()-1) == 's') {
                // store index of first word ending with s
                if(firstWordEndingWithS == -1) {
                    firstWordEndingWithS = i;
                }
                numWordsEndingWithS++;
            }
            else if(wordLower.charAt(wordLower.length()-1) == 'y') {
                // last char is Y
                if(firstWordEndingWithY == -1) {
                    firstWordEndingWithY = i;
                }
                numWordsEndingWithY++;
            }
        }

        //check if both indices exist, then swap them
        if(firstWordEndingWithS != -1 && firstWordEndingWithY != -1) {
            String temp = words[firstWordEndingWithS];
            words[firstWordEndingWithS] = words[firstWordEndingWithY];
            words[firstWordEndingWithY] = temp;
        }




        // Display the word count
        System.out.println("The number of words ending with s is " + numWordsEndingWithS);
        System.out.println("The number of words ending with y is " + numWordsEndingWithY);
        //System.out.println(firstWordEndingWithS + " " + firstWordEndingWithY);

        System.out.println("The updated string is: ");
        System.out.println(String.join(" ", words));



    }

}