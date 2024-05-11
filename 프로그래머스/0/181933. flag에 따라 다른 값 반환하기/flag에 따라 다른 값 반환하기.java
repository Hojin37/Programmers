class Solution {
    public int solution(int a, int b, boolean flag) {
        // 정답 선언 및 초기화
        int answer = 0;
        // flag에 따라 다른 연산을 할 삼항 연산자
        answer = (flag) ? (a+b) : (a-b);
        
        // 정답 리턴
        return answer;
    }
}