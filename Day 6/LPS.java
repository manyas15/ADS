public class LPS {
    public static int[] lps(String pattern){
        int n = pattern.length();
        int[] lps = new int[n];
        int i = 1;
        int len = 0;
        while(i < n){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0){
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static void main(String[] args) {
        String s1 = "ababaca";
        int[] lps = lps(s1);
        for(int i : lps){
            System.out.print(i + " ");
        }
    }
}
