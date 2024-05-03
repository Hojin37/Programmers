class Solution {
    public int[] solution(int start, int end_num) {
        // 배열의 길이를 구할 int arrLength 선언 및 초기화
        int arrLength = start - end_num + 1;
        // 정답 선언 및 초기화 - 길이는 start-end_num
        int[] answer = new int[arrLength];
        // 카운트 다운을 할 for문
        for(int i=0; i<arrLength; i++){
            answer[i] = start--;
        }
        
        // 정답 리턴
        return answer;
    }
}