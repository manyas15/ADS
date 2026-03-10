public class LargestEle {
    public static void main(){
        int[] arr= {1,2,4,5,3,7};
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element in the array is " + max);
    }
}

//Algorithm Used: Linear Traversal
//You scan the entire array once and keep track of the largest element found so far.
//Time Complexity -> O(n) because the array is traversed once.
//Space Complexity -> O(1) only one extra variable (max) is used.

/*
Common Problems Using This Pattern (1D Array + Linear Traversal)
LeetCode
-> Find Numbers with Even Number of Digits
-> Richest Customer Wealth
-> Third Maximum Number
-> Check If N and Its Double Exist
-> Maximum Product of Two Elements in an Array

HackerRank
-> Birthday Cake Candles
-> Mini-Max Sum
-> Compare the Triplets
-> Simple Array Sum
-> Plus Minus
 */