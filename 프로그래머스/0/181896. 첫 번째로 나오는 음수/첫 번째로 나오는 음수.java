class Solution {
    public int solution(int[] num_list) {
        // 정답 선언 및 초기화 - 기본 정답을 -1로 초기화
        int answer = -1;
        // 처음으로 나오는 음수의 인덱스를 구할 for문
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] < 0){
                answer = i;
                break;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}