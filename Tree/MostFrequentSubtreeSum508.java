package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by shubham.goyal on 2/7/17.
 */
public class MostFrequentSubtreeSum508 {


    HashMap<Integer, Integer> myMap = new HashMap<>();
    int max = Integer.MIN_VALUE;

    public int[] findFrequentTreeSum(TreeNode root) {
        makeSumMap(root);
        List<Integer> list = new LinkedList<>();
        for(int i : myMap.keySet()){
            if(myMap.get(i) == max){
                list.add(i);
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public int makeSumMap (TreeNode root){
        if(root == null) {
            return 0;
        }
        int sum = makeSumMap(root.left) + makeSumMap(root.right) + root.val;
        myMap.put(sum, myMap.getOrDefault(sum,0) + 1);
        max = Math.max(max, myMap.get(sum));
        return sum;
    }

    public static void main(String[] args) {
        MostFrequentSubtreeSum508 obj = new MostFrequentSubtreeSum508();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-3);
        obj.findFrequentTreeSum(root);
    }
}
