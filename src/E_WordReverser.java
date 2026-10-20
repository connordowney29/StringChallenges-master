/***
 * Problem: Write a method that takes a sentence and reverses
 * each word individually without changing their positions.
 * Expected output: avaJ si emosewa
 */

public class E_WordReverser {

    public static void main(String[] args) {
        E_WordReverser e = new E_WordReverser();
    }

    public E_WordReverser() {
        String sentence = "Java is awesome";
        reverseWords(sentence);  // Output: avaJ si emosewa
    }

    public void reverseWords(String sentence) {
        /* TODO: your code goes here */

        String words[] = sentence.split(" ");
        String reverseSentence = "";
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";

            //counting down for loop creating the reverse word
            for (int backwards = word.length() - 1; backwards >= 0; backwards--) {
                reverseWord = reverseWord + word.charAt(backwards);
            }
            //if there is already excisting content, add a space
            if (!(reverseSentence.equals(""))) {
                reverseSentence = reverseSentence + " ";
            }

            //combine the already sentence with the next reverse word
            reverseSentence = reverseSentence + reverseWord;

        }
        System.out.println(reverseSentence);


        }


    }

