import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        // 정답 배열 선언 및 초기화 / 배열의 길이는 5
        int[] answer = new int[5];
        // 배열을 오름차순으로 정렬
        Arrays.sort(num_list);
        // 가장 작은 수를 answer에 대입할 for문
        for(int i=0; i<5; i++){
            answer[i] = num_list[i];
        }
        
        // 정답 리턴
        return answer;
    }
}