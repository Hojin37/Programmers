class Solution {
    public int solution(String myString, String pat) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 문자열을 contains로 비교하기 위해 두 문자열을 모두 소문자로 바꿈
        if(myString.toLowerCase().contains(pat.toLowerCase())){
            answer = 1;
        }
        
        
        // 정답 리턴
        return answer;
    }
}