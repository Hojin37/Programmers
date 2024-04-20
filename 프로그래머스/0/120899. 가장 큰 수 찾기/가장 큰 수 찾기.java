class Solution {
    public int[] solution(int[] array) {
        // 정답 배열 선언 및 초기화
        int[] answer = new int[2];
        // 정답 배열의 첫번째 수를 인덱스 0으로 설정
        answer[0] = array[0];
        // 배열을 분석할 for문
        for(int i=0; i<array.length; i++){
            if(answer[0]<array[i]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}