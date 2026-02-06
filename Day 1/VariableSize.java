public class VariableSize{
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3};
        int k = 7;
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for(int right = 0; right < arr.length; right++){
            sum+= arr[right];
            while(sum > k){
                sum -= arr[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println(maxLen);
    }
}


//explanation
//arr = {2,1,5,1,3}
        //k = 7;
        //left = 0;
        //sum = 0
        //maxLen = 0

        // arr = {2,1,5,1,3}
        // add arr[0] = 2;
        // sum = 2;
        // window = [2]
        // length = 1

        // right = 1
        // add arr[1] = 1
        // sum = 3
        // window = [ 2, 1]
        // length =  2;

        // right = 2;
        // add arr[2] = 5;
        // sum = 8

        // remove arr[0]
        // sum = 6
        // left = 1

        // window = [1,5]
        // length = 2

        // right = 3
        // add arr[3] = 1
        // sum = 7
        //window = [1,5,1]
        //length = 3

        // right = 4
        // add arr[4] = 3
        // sum = 10

        // remove arr[1] sum = 9
        // remove arr[2] sum = 4