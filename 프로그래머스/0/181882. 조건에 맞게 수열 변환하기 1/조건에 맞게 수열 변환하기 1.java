class Solution {
    public int[] solution(int[] arr) {
        // 정답 배열 선언 및 초기화 - 길이는 arr과 같음
        int[] answer = new int[arr.length];
        // arr을 분석할 for문
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 50 && arr[i]%2 == 0){
                answer[i] = arr[i]/2;
            } else if(arr[i] < 50 && arr[i]%2 == 1){
                answer[i] = arr[i]*2;
            } else {
                answer[i] = arr[i];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}