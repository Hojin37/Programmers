class Solution {
    public String solution(int[] numLog) {
        // 정답 선언 및 초기화
        String answer = "";
        // numLog의 값 변화에 따라 wasd를 입력하는 for문
        for(int i=1; i<numLog.length; i++){
            if(numLog[i] - 1 == numLog[i-1]){
                answer += "w";
            } else if(numLog[i] + 1 == numLog[i-1]){
                answer += "s";
            } else if(numLog[i] - 10 == numLog[i-1]){
                answer += "d";
            } else {
                answer += "a";
            }
        }
        
        // 정답 리턴
        return answer;
    }
}