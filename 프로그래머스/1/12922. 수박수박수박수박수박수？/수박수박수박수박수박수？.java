class Solution {
    public String solution(int n) {
        // 정답 선언 및 초기화
        String answer = "";
        
        // "수박수박수"의 패턴을 유지하는 for문
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                answer += "수";
            } else {
                answer += "박";
            }
        }
        
        // 정답 리턴
        return answer;
    }
}