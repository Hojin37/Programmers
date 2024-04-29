class Solution {
    public String solution(String my_string, String alp) {
        // 정답 선언 및 초기화
        String answer = "";
        // alp의 대문자형인 alp2 선언 및 초기화 = toUpperCase() 사용
        String alp2 = alp.toUpperCase();
        // replace를 이용해 해당 문자를 대문자로 바꿈
        answer = my_string.replace(alp, alp2);
        
        // 정답 리턴
        return answer;
    }
}