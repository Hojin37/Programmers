class Solution {
    public int[] solution(int start_num, int end_num) {
        // 배열의 길이 선언 및 초기화
        int n = end_num - start_num + 1;
        // 정답 배열 선언 및 초기화
        int[] answer = new int[n];
        // 배열에 차례로 숫자를 담을 for문
        for(int i=0; i<n; i++){
            answer[i] = start_num++;
        }
        
        // 정답 리턴
        return answer;
    }
}