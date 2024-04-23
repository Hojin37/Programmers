class Solution {
    public int solution(String n_str) {
        // 정답 선언 및 초기화
        int answer = 0;
        String str = "";
        // n_str을 char 배열로 변경
        char[] arr = n_str.toCharArray();
        // arr의 정수값을 가져올 for문
        for(int i=0; i<arr.length; i++){
            str += arr[i];
        }
        answer = Integer.valueOf(str);
        
        // 정답 리턴
        return answer;
    }
}