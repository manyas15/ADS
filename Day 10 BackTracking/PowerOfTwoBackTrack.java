public class PowerOfTwoBackTrack {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }

        if(n <= 0 || n % 2 != 0){
            return false;
        }

        return isPowerOfTwo(n/2);
    }

    // or only return ->  return n > 0 && (n & (n - 1)) == 0;
}
