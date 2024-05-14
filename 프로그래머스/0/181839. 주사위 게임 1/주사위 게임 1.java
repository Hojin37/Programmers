class Solution {
    public int solution(int a, int b) {
        // 정답 선언 및 초기화
        int answer = 0;
        // a와 b의 홀짝 여부에 따라 다른 점수를 계산하는 if문
        if(a%2 == 1 && b%2 == 1){
            answer += a*a + b*b;
        } else if(a%2 == 1 || b%2 == 1){
            answer += 2 * (a + b);
        } else {
            answer += Math.abs(a - b);
        }
        
        // 정답 리턴
        return answer;
    }
}