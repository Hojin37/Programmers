class Solution {
    public int[] solution(int n, int k) {
        // 정답 배열 선언 및 초기화 - 배열의 길이는 n/k
        int[] answer = new int[n/k];
        // n이하인 k의 배수를 저장할 for문
        for(int i=0; i<n/k; i++){
            answer[i] = k*(i+1);
        }
        
        // 정답 리턴
        return answer;
    }
}