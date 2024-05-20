class Solution {
    public int solution(String binomial) {
        // 정답 선언 및 초기화
        int answer = 0;
        
        // 문자열 binomial을 연산자 기준으로 두 수로 나누기 - \\으로 이스케이프 처리
        String[] num = binomial.split(" \\+ | \\- | \\* ");
        // a와 b의 데이터 공간 선언 및 초기화
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        
        // 연산자에 따른 계산
        if(binomial.contains("+")){answer = a + b;}
        else if(binomial.contains("-")){answer = a - b;}
        else {answer = a * b;}
        
        // 정답 리턴
        return answer;
    }
}