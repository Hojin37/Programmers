class Solution {
    public int solution(int[] num_list) {
        // 정답 선언 및 초기화
        int answer = 0;
        
        // 배열의 모든 수를 0으로 만들기 위한 횟수를 구하는 for문
        for(int i=0; i<num_list.length; i++){
            while(num_list[i] > 1){
                if(num_list[i]%2 == 0){
                    num_list[i] = num_list[i]/2;
                    answer++;
                } else{
                    num_list[i] = (num_list[i] - 1)/2;
                    answer++;
                }
            }
        }
        
        // 정답 리턴
        return answer;
    }
}