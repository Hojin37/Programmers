class Solution {
    public String solution(String my_string, int k) {
        // 정답 선언 및 초기화
        String answer = "";
        // k번 만큼 문자열을 추가 반복할 while문
        while(k>0){
            answer += my_string;
            k--;
        }
        
        // 정답 리턴
        return answer;
    }
}