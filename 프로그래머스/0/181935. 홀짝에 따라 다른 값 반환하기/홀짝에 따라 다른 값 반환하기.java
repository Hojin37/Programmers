class Solution {
    public int solution(int n) {
        // 정답 선언 및 초기화
        int answer = 0;
        // n의 홀짝 여부에 따라 다른 연산을 할 for문
        for(int i=1; i<=n; i++){
            if(n%2 == 0 && i%2 == 0){
                answer += i*i;
            } else if(n%2 == 1 && i%2 ==1){
                answer += i;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}