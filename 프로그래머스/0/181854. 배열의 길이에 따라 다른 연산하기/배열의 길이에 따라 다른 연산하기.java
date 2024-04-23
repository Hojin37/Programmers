class Solution {
    public int[] solution(int[] arr, int n) {
        // 정답 배열 선언 및 초기화 / 배열의 길이는 arr의 길이
        int[] answer = new int[arr.length];
        // 배열의 길이에 따라 다른 연산을 할 for문
        for(int i=0; i<arr.length; i++){
            // 배열의 길이가 홀수일 경우
            if(arr.length%2 == 1 && i%2 == 0){
                answer[i] = arr[i] + n;
            } else if(arr.length%2 == 0 && i%2 == 1){
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}