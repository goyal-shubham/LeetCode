import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by shubham.goyal on 10/9/16.
 */
public class WordLadder {

    class WordNode {
        String word;
        int numNodes;

        WordNode(String word, int numNodes) {
            this.word = word;
            this.numNodes = numNodes;
        }
    }

    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        LinkedList<WordNode> myQueue = new LinkedList<>();
        myQueue.add(new WordNode(beginWord, 1));

        wordList.add(endWord);

        while (!myQueue.isEmpty()) {
            WordNode current = myQueue.remove();
            String word = current.word;
            if (word.equals(endWord)) {
                return current.numNodes;
            }

            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char temp = arr[i];
                    arr[i] = c;
                    String newWord = new String(arr);
                    if (wordList.contains(newWord)) {
                        myQueue.add(new WordNode(newWord, current.numNodes + 1));
                        wordList.remove(newWord);
                    }

                    arr[i] = temp;
                }
            }
        }
        return 0;
    }
}

