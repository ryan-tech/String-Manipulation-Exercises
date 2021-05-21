
import java.util.*; // for scanner and map

class Words {
    /*
 - Ask User to enter a sentence or create a String variable to assign a sentence to it
- Count all Words in a String and display the count
- Display the count of word in a sentence
    * */
    public static void main(String[] args) {
        String userInput;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string.");
        userInput = myObj.nextLine();
        String words[] = userInput.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        // create a map to keep track of the occurrences
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String word : words) {
            if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else {
                map.put(word, 1);
            }
        }

        // print the key and values of the map
        for(Map.Entry entry : map.entrySet()) {
            System.out.println("The word " + "\"" + entry.getKey() + "\" appears " + entry.getValue() + " time(s).");
        }

    }
}