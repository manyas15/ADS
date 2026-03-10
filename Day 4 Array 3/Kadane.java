public class Kadane {
    public static void main(String[] args){
        int[] arr = {2,4,6,-5,8,9,10};
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}
