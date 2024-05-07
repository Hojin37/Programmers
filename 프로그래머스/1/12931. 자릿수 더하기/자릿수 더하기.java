public class Solution {
    public int solution(int n) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 자연수 n을 10으로 나눠가며 나머지를 더할 for문
        while(n > 0){
            answer += n%10;
            n /= 10;
        }
        
        // 정답 리턴
        return answer;
    }  
}