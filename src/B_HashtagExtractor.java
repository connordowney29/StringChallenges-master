/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */
        //find where there are hashtags
        int index = post.indexOf("#");
        String print = "";
        //while loop for while the sentence isnt over, go search for the hashtags
        while(index != -1) {
            int endWord = post.indexOf(" ", index);
            if (endWord == -1) {
                endWord = post.length();
            }
            String hashtag = post.substring(index, endWord);
            //to remove the end punctatuation
            char punctuationFinder = hashtag.charAt(hashtag.length()-1);

            if (punctuationFinder == '!' || punctuationFinder == '.' || punctuationFinder == '?')
            {
                hashtag = hashtag.substring(0,hashtag.length()-1);
            }
            //combined the hashtags with comms for the print
            if (!print.equals("")) {
                print = print + ", ";
            }
            print = print + "Hashtag: " + hashtag;

            //reset the index to the next hashtag from the end of the last one
            index = post.indexOf("#", endWord);

        }
        System.out.println(print);
        }
    }


