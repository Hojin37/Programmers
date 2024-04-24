class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int m = n;
        char[] arr = my_string.toCharArray();

        for(int i=0; i<arr.length; i++){
            while(n>0) {
            answer += arr[i];
            n--;
            }
            n = m; 
        }
        return answer;
    }
}