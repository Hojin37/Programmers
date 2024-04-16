class Solution {
    public int solution(int n) {
        // 정답 선언 및 초기화 기본 1판
        int answer = 1;
        // 피자의 조각 수 선언 및 초기화
        int slice = 6;
        // 피자가 맞게 떨어질 때까지 판수를 더한다
        while(slice%n!=0){
            slice += 6;
            answer++;
        }
            
        // 정답 출력
        return answer;
    }
}