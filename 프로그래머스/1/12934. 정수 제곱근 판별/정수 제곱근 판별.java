class Solution {
    public long solution(long n) {
        // 정답 선언 및 초기화
        long answer = -1;
        // 제곱근을 구해서 1로 나눈 나머지가 없을 경우 양의 제곱으로 판별
        if((double)Math.sqrt(n)%1.0 == 0){
            answer =(int)Math.round(Math.sqrt(n)) + 1;
            answer *= answer;
        }
        
        // 정답 리턴
        return answer;
    }
}