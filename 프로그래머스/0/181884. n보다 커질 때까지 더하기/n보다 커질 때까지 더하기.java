class Solution {
    public int solution(int[] numbers, int n) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 원소를 하나씩 더해 연산할 for문
        for(int i=0; i<numbers.length; i++){
            if(answer <= n){
                answer += numbers[i];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}