class Solution {
    public int solution(int a, int b, int c) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 세 숫자를 비교해 서로 다른 연산하기
        if(a!=b && a!=c && b!=c){
            answer = a + b + c;
        } else if(a==b && b!=c){
            answer = (a+b+c) * (a*a + b*b + c*c);
        } else if(a!=b && b==c){
            answer = (a+b+c) * (a*a + b*b + c*c);
        } else if(a!=b && a==c){
            answer = (a+b+c) * (a*a + b*b + c*c);
        } else if(a==b && b==c){
            answer = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        
        // 정답 리턴
        return answer;
    }
}