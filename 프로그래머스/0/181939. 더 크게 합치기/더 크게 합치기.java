class Solution {
    public int solution(int a, int b) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 코드의 간결성을 위해 연산시 사용할 문자열을 선언 및 초기화
        int value1 = Integer.valueOf((a + "") + (b + ""));
        int value2 = Integer.valueOf((b + "") + (a + ""));
        
        // 두 값의 크기를 비교해 리턴할 삼항연산자
        answer = (value1 >= value2) ? value1 : value2;
        
        // 정답 리턴
        return answer;
    }
}