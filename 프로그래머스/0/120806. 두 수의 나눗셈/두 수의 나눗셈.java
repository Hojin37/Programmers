class Solution {
    public int solution(int num1, int num2) {
        // 정답 선언 및 num1에 1000을 먼저 곱한 후 num2로 나눈다
        int answer = ((num1 * 1000)/num2);
        // 정답 리턴
        return answer;
    }
}