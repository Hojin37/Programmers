class Solution {
    public int solution(int[] arr, int idx) {
        // 정답 선언 및 초기화 
        int answer = -1;
        // arr배열에서 가장 작은 인덱스를 반환하는 for문
        for(int i=0; i<arr.length; i++){
            if(i>=idx && arr[i] == 1){
                answer = i;
                break;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}