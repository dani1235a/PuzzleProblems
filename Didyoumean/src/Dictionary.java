/*
I'm sure, you know Google's "Did you mean ...?", when you entered a search term
 and mistyped a word. In this kata we want to implement something similar.

You'll get an entered term (lowercase string) and an array of known words
(also lowercase strings). Your task is to find out, which word from the
dictionary is most similar to the entered one. The similarity is described
by the minimum number of letters you have to add, remove or replace in order
to get from the entered word to one of the dictionary. The lower the number
of required changes, the higher the similarity between each two words.

Same words are obviously the most similar ones. A word that needs one letter
to be changed is more similar to another word that needs 2 (or more) letters
to be changed. E.g. the mistyped term berr is more similar to beer (1 letter
to be replaced) than to barrel (3 letters to be changed in total).

Extend the dictionary in a way, that it is able to return you the most similar
word from the list of known words.

Code Examples:

Dictionary fruits = new Dictionary(new String[]{"cherry", "pineapple",
"melon", "strawberry", "raspberry"});

fruits.findMostSimilar("strawbery"); // must return "strawberry"
fruits.findMostSimilar("berry"); // must return "cherry"

Dictionary things = new Dictionary(new String[]{"stars", "mars", "wars",
 "codec", "codewars"});
things.findMostSimilar("coddwars"); // must return "codewars"

Dictionary languages = new Dictionary(new String[]{"javascript", "java",
"ruby", "php", "python", "coffeescript"});
languages.findMostSimilar("heaven"); // must return "java"
languages.findMostSimilar("javascript"); // must return "javascript"
(same words are obviously the most similar ones)
I know, many of you would disagree that java is more similar to heaven
than all the other ones, but in this kata it is ;)

Additional notes:

there is always exactly one possible solution
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final String[] words;

    public static void main(String... args) {
        Dictionary dictionary = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        System.out.println(dictionary.findMostSimilar("berry"));
    }

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        Map<String, Integer> mywords = new HashMap<>();

        for(String word : words) {
            mywords.put(word, difference(to, word));
        }

        return Collections.min(mywords.keySet());
    }

    // Private method used to count how many characters
    // different are in the same position in both string.
    // TODO: This only counts the differences in each location of a char, I need to count also replace, and remove and add.
    private Integer difference(String to, String word) {
        int count = 0;

        String longer = (to.length() > word.length()? to:word);
        String shorter = (to.length() >= word.length()? word:to);

        for (int i = 0; i < shorter.length() + 1; i++) {
            if(i == shorter.length()){
                count += longer.length() - shorter.length();
                break;
            }
            if (longer.charAt(i) != shorter.charAt(i)) count++;

        }

        return count;
    }
}