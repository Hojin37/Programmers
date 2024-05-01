class Solution {
    public int solution(int[] num_list) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 짝수 선언 및 초기화
        int even = 0;
        // 홀수 선언 및 초기화
        int odd = 0;
        // for문
        for(int i=0; i<num_list.length; i++){
            if((i+1)%2 == 0){
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        answer = (even>=odd) ? even : odd;
        
        // 정답 리턴
        return answer;
    }
}