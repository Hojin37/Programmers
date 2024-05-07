class Solution {
    public int solution(int n) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 나머지가 없는 약수를 찾기 위한 for문
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                answer += i;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}