import java.util.List;

public class BdayCakeCandleHac {

    public static int birthdayCakeCandles(List<Integer> candles) {

        int max = candles.get(0);
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
                count = 1;
            } else if (candles.get(i) == max) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        List<Integer> candles = List.of(1,2,3,4,4,5,5,5);
        int result = birthdayCakeCandles(candles);
        System.out.println("Number of tallest candles blown out: " + result);
    }
}

//Algorithm Used: Linear Traversal
//You scan the entire array once and keep track of the largest element found so far and count how many times it occurs.
//Time Complexity -> O(n) because the array is traversed once.
//Space Complexity -> O(1) only two extra variables (max and count) are used
