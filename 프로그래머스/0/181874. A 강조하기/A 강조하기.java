class Solution {
    public String solution(String myString) {
        // 정답 선언 및 초기화
        String answer = "";
        // a를 우선 숫자 0으로 변경 
        String str1 = myString.replace("a", "0");
        // 전체를 소문자로 변환
        String str2 = str1.toLowerCase();
        // 0을 대문자 A로 변경 - 이전 과정에서 소문자로 변환된 "A"도 다시 "A"로 변환
        answer = str2.replace("0", "A").replace("a", "A");
        
        // 정답 리턴
        return answer;
    }
}