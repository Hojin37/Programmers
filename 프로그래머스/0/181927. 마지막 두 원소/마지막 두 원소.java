class Solution {
    public int[] solution(int[] num_list) {
        // 정답 배열 선언 및 초기화 - 배열의 길이는 num_list + 1
        int[] answer = new int[num_list.length + 1];
        // 배열의 마지막 두 원소를 가져와 계산할 for문
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
            if(num_list[num_list.length-1] > num_list[num_list.length-2]){
                answer[num_list.length] = num_list[num_list.length-1] - num_list[num_list.length-2];
            } else if(num_list[num_list.length-2] >= num_list[num_list.length-1]){
                answer[num_list.length] = answer[num_list.length-1] * 2;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}