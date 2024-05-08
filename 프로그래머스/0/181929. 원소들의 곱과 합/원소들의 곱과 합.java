class Solution {
    public int solution(int[] num_list) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 모든 원소들의 곱 선언 및 초기화
        int x = 1;
        // 모든 원소들의 합 선언 및 초기화
        int n = 0;
        
        // 모든 원소들의 합과 곱을 계산할 for문
        for(int i=0; i<num_list.length; i++){
            x *= num_list[i];
            n += num_list[i];
        }
        // 모든 원소들의 곱과 합의 제곱을 비교
        if(x < n*n){
            answer = 1;
        }
        
        // 정답 리턴
        return answer;
    }
}