/***
 * Problem: You are given a long string containing a hidden word.
 * Write a function that finds and prints
 * the word hidden between two markers ("start" and "end").
 * Expected output: Hidden word: Hello
 */

public class C1_HiddenWordFinder {

    public static void main(String[] args) {
        C1_HiddenWordFinder c = new C1_HiddenWordFinder();
    }

    public C1_HiddenWordFinder() {
        String sentence = "This is a test startHelloend string.";
        findHiddenWord(sentence);  // Output: Hidden word: Hello
    }

    public void findHiddenWord(String sentence) {
        /* TODO: your code goes here */
String start = "start";
String end = "end";
//find start point
int startPoint = sentence.indexOf(start);
//go to begin of word rather than s
startPoint = startPoint + start.length();
//end point
int endPoint = sentence.indexOf(end, startPoint);
//hidden word using a substring, in between start point and end point
String hiddenWord = sentence.substring(startPoint, endPoint);
//print
System.out.println("Hidden Word: " + hiddenWord);









    }

}
