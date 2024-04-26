class Solution {
    public int solution(int n) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 짝수만을 구해 더할 for문
        for (int i=0; i<=n; i++) {
            if (i%2 == 0){
                System.out.println(i);
                answer += i;
            }
        }
        // 정답 리턴
        return answer;
    }
}