class Solution {
    public int solution(int num, int n) {
        // 정답 선언 및 초기화
        int answer = 0;
        // num이 n의 배수일 경우 answer에 1을 입력
        if(num%n == 0){
            answer = 1;
        }
        
        // 정답 리턴
        return answer;
    }
}