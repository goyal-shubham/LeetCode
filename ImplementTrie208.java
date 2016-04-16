import java.util.HashMap;

/**
 * Created by shubhamgoyal on 4/15/16.
 */
public class ImplementTrie208 {

    private TrieNode root;

    public ImplementTrie208() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {

        HashMap<Character, TrieNode> child = root.map;

        for(int i = 0; i < word.length(); i++)
        {
            TrieNode t;

            char c = word.charAt(i);
            if(child.containsKey(c))
            {
                t = child.get(c);
            }
            else
            {
                t = new TrieNode();
                child.put(c, t);
            }

            child = t.map;
            if( i == word.length() - 1)
            {
                t.isLeaf = true;
            }
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {

        TrieNode t = searchTrieNode(word);
        if(t != null && t.isLeaf )
        {
            return true;
        }
        return false;

    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {

        if(searchTrieNode(prefix) != null)
        {
            return true;
        }
        else
        {
            return false;
        }

    }


    public TrieNode searchTrieNode(String word)
    {
        HashMap<Character, TrieNode> temp = root.map;
        TrieNode t = null;
        for(int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if(temp.containsKey(c))
            {
                t = temp.get(c);
                temp = t.map;
            }
            else
            {
                return null;
            }


        }
        return t;

    }
}

class TrieNode {
    // Initialize your data structure here.

    char c;
    HashMap<Character, TrieNode> map = new HashMap<>();
    boolean isLeaf;

    public TrieNode(char c)
    {
        this.c = c;
    }

    public TrieNode()
    {

    }

}
