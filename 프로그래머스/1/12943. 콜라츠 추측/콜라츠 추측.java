class Solution {
    public int solution(long num) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 횟수를 의미하는 int cnt선언 및 초기화
        int cnt = 0;
        
        // 주어진 수가 1이 될 때까지 반복하는 while문
        while(num != 1){
            if(cnt == 500){
                cnt = -1;
                break;
            } else if(num%2 == 0){
                num /= 2;
                cnt++;
            } else{
                num = num*3 + 1;
                cnt++;
            }
        }
        // answer에 cnt입력
        answer = cnt;
        
        // 정답 리턴
        return cnt;
    }
}