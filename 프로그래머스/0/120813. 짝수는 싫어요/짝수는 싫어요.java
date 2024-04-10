class Solution {
    public int[] solution(int n) {
        // 정답 배열 선언 및 초기화
        int[] answer = new int[(n+1)/2];
        // n 이하의 수를 추출하기 위한 for문 
        for(int i=0; i<=n; i++){
            // n 이하의 수 중 짝수를 제외하고 배열에 입력
            if(i%2 != 0) {
            answer[i/2] = i;
            } 
        }
        
        return answer;
    }
}