class Solution {
    public String solution(String[] arr) {
        // 정답 선언 및 초기화
        String answer = "";
        // 문자열을 모두 더하는 for문
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        
        // 정답 리턴
        return answer;
    }
}