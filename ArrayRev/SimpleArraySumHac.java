
import java.util.List;

public class SimpleArraySumHac {

    public static int simpleArraySum(List<Integer> ar) {

        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }

    public static void main(String[] args){
        List<Integer> arr = List.of(1,2,3,4,5);
        int result = simpleArraySum(arr);
        System.out.println("The sum is: " + result);
    }
}
