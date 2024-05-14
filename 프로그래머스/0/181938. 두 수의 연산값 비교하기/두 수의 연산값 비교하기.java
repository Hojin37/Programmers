class Solution {
    public int solution(int a, int b) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 문자열을 더해 숫자로 바꾼 값과 2*a*b의 연산을 비교해 값을 내는 삼항연산자
        answer = (Integer.valueOf((a+"")+(b+"")) >= 2*a*b) ? Integer.valueOf((a+"")+(b+"")) : 2*a*b;
        
        // 정답 리턴
        return answer;
    }
}