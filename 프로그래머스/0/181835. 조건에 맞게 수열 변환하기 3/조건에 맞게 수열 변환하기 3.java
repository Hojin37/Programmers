class Solution {
    public int[] solution(int[] arr, int k) {
        // 정답 배열 선언 및 초기화 - 길이는 arr과 같다
        int[] answer = new int[arr.length];
        // k의 홀짝 여부에 따라 다른 연산을 하는 for문
        for(int i=0; i<arr.length; i++){
            if(k%2 == 0){
                answer[i] = arr[i] + k;
            } else {
                answer[i] = arr[i] * k;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}