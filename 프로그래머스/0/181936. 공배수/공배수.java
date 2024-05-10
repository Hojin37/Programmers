class Solution {
    public int solution(int number, int n, int m) {
        // 정답 선언 및 초기화
        int answer = 0;
        // n과 m의 공배수임을 확인하는 if문
        if(number%n == 0 && number%m == 0){
            answer = 1;
        }
        
        // 정답 리턴
        return answer;
    }
}