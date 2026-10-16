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

        int index = post.indexOf("#");
        String print = "";

        while(index != -1) {
            int endWord = post.indexOf(" ", index);
            if (endWord == -1) {
                endWord = post.length();
            }
            String hashtag = post.substring(index, endWord);

            if (!print.equals("")) {
                print = print + ", ";
            }
            print = print + "Hashtag: " + hashtag;
            index = post.indexOf("#", endWord);
        }
        System.out.println(print);
        }
    }


