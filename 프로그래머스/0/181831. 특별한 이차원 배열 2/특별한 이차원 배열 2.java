class Solution {
    public int solution(int[][] arr) {
        // 정답 선언 및 초기화
        int answer = 0;
        
        // arr이 조건을 만족하는지 확인하는 이중 for문
        loop :
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == arr[j][i]){
                    answer = 1;
                } else {
                    answer = 0;
                    break loop;
                }
            }
        }
        
        // 정답 리턴
        return answer;
    }
}