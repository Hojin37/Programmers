class Solution {
    public int solution(int[] num_list, int n) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 배열 num_list 안에 n이 있는지 찾는 for문
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] == n){
                answer = 1;
                break;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}