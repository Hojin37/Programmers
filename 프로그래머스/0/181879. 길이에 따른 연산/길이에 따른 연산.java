class Solution {
    public int solution(int[] num_list) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 리스트의 길이별로 다른 연산을 위한 for문
        if(num_list.length >= 11) {
            for(int i=0; i<num_list.length; i++){
                answer += num_list[i];
            }
        } else {
            answer = 1;
            for(int j=0; j<num_list.length; j++){
                answer *= num_list[j];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}