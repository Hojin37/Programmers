class Solution {
    public long solution(int a, int b) {
        // 정답 선언 및 초기화
        long answer = 0;
        // a와 b사이의 모든 수의 합을 구하는 for문
        if(a<b){
            for(int i=a; i<=b; i++){
                answer += i;
            }
        } else{
            for(int j=b; j<=a; j++){
                answer += j;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}