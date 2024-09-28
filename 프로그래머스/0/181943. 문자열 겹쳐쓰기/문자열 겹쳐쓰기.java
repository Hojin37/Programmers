class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            if(i != s){
                answer += arr[i];
            } else {
                answer += overwrite_string;
                i += overwrite_string.length() - 1;
            }
        }
        
        return answer;
    }
}