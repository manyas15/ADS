public class FirstOcc {
    public int strStr(String haystack, String needle){
        if(needle.length() == 0) return 0;
        for(int i =0; i <= haystack.length() - needle.length(); i++){
            int j;
            for(j = 0; j < needle.length(); j++){
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
}

//haystack = "hello", needle = "ll"
//haystack = 5, needle = 2
//max starting index = 5 -2 = 3
// i = 0,1,2,3

