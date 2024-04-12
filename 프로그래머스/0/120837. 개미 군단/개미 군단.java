class Solution {
    public int solution(int hp) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 개미들의 공격력 선언
        int g = 5;
        int s = 3;
        int w = 1;
        // 가장 공격력이 높은 개미부터 공격
        answer += hp/g;
        hp%=g;
        answer += hp/s;
        hp%=s;
        answer += hp/w;
        
        
        // 정답 출력
        return answer;
    }
}