//baseball game 682 leetcode
import java.util.*;
public class OperationsStack {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String a : operations) {
            if(a.equals("C")) st.pop();
            else if(a.equals("D")) st.push(st.peek() * 2);
            else if(a.equals("+")){
                int last = st.pop();
                int updatedScore = last + st.peek();
                st.push(last);
                st.push(updatedScore);
            }
            else{
                st.push(Integer.parseInt(a));
            }
        }

        int sum = 0;
        for(int num : st){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        OperationsStack solution = new OperationsStack();
        String[] operations = {"5","2","C","D","+"};
        System.out.println(solution.calPoints(operations)); // Output: 30
    }
}

//operations = ["5"."2","c","d","+"];
//operation = "5"
//stack = [5]  score add
//operation = "2"
//stack = [5,2]  score add

//operation = "c"
//stack = [5];
//operation = "d"
//stack = [5, 10]

//operation = "+"
//stack = [5,10,15]
// final cores = 5+10+15 = 30
