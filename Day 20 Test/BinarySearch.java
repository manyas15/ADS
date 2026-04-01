public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3};
        int target = 2;

        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target){
                res = mid;
                end = mid - 1; // to find the first occurrence
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(res != -1){
            System.out.println("element found at index: " + res);
        }
        else{
            System.out.println("Not found");
        }
    }
}
