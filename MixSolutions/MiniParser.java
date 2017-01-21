package MixSolutions;

/**
 * Created by shubham.goyal on 10/22/16.
 */
public class MiniParser {

//    public class Solution {
//        public NestedInteger deserialize(String s) {
//            Stack<NestedInteger> myStack = new Stack<>();
//            String temp = "";
//            for(char c : s.toCharArray())
//            {
//                switch(c){
//                    case '[':
//                        myStack.push(new NestedInteger());
//                        break;
//
//                    case ']':
//                        if(!temp.equals(""))
//                        {
//                            myStack.peek().add(new NestedInteger(Integer.parseInt(temp)));
//                            temp = "";
//                        }
//
//                        NestedInteger top = myStack.pop();
//                        if(!myStack.isEmpty())
//                        {
//                            myStack.peek().add(top);
//                        }
//                        else
//                        {
//                            return top;
//                        }
//                        break;
//                    case ',':
//                        if(!temp.equals(""))
//                        {
//                            myStack.peek().add(new NestedInteger(Integer.parseInt(temp)));
//                            temp = "";
//                        }
//                        break;
//                    default:
//                        temp += c;
//                        break;
//                }
//            }
//
//            if(!temp.equals(""))
//            {
//                return new NestedInteger(Integer.parseInt(temp));
//            }
//            return myStack.peek();
//        }
//    }
}
