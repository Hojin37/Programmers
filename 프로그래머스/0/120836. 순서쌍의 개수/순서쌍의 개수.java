class Solution {
    public int solution(int n) {
        // 정답 선언 및 초기화
        int answer = 0;
        // n 아래의 수를 계산하기 위한 for문
        for(int i=1; i<=n; i++) {
            // n을 i로 나눴을 때, 나머지가 없을 경우
            if((n%i)==0){
                // 정답에 1씩 추가
                answer++;
            }
        }
        
        // 정답출력
        return answer;
    }
}