class Solution {
    public int solution(int[] box, int n) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 한 층에 들어가는 주사위의 수
        answer += (box[0]/n)*(box[1]/n);
        // 주사위의 층 수
        answer *= box[2]/n;
         
        // 정답 출력
        return answer;
    }
}