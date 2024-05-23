class Solution {
    public int solution(int[] date1, int[] date2) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 두 배열을 비교
        if(date1[0] < date2[0]){
            answer = 1;
        } if(date1[0] == date2[0] && date1[1] < date2[1]){
            answer = 1;
        } if(date1[0] == date2[0] && date1[1] == date2[1] && date1[2] < date2[2]){
            answer = 1;
        }
        
        // 정답 리턴
        return answer;
    }
}