import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        // 정답 배열 선언 및 초기화 / 길이는 num_list에서 5를 뺀다
        int[] answer = new int[num_list.length-5];
        // 배열 오름차순 정렬
        Arrays.sort(num_list);
        // 가장 작은 5개의 수를 제외할 for문
        for(int i=0; i<num_list.length; i++){
            if(i>4){
                answer[i-5] = num_list[i];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}