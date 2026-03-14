//844. Backspace String Compare

import java.util.Stack;

public class BackspaceCompare {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String str){
        Stack<Character> st = new Stack<>();

        for(char c : str.toCharArray()){
            if(c != '#') st.push(c);
            else if(!st.isEmpty()) st.pop();
        }

        StringBuilder result = new StringBuilder();
        for(char c: st) result.append(c);

        return result.toString();
    }
    public static void main(String[] args) {
        BackspaceCompare solution = new BackspaceCompare();
        String s = "ab#c", t = "ad#c";
        System.out.println(solution.backspaceCompare(s, t)); // Output: true
    }
}
