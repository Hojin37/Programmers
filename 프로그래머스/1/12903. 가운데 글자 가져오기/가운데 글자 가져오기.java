class Solution {
    public String solution(String s) {
        // 정답 선언 및 초기화
        String answer = "";
        
        // s의 길이가 짝수일 경우
        if(s.length()%2 == 0){
            answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
        } else{
            answer = s.substring(s.length()/2, s.length()/2 + 1);
        }
        
        // 정답 리턴
        return answer;
    }
}