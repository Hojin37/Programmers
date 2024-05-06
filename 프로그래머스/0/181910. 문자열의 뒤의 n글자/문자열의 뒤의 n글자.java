class Solution {
    public String solution(String my_string, int n) {
        // 정답 선언 및 초기화
        String answer = "";
        // substring을 이용해 뒤에서 n번째 문자부터 가져오기
        answer = my_string.substring(my_string.length() - n, my_string.length());

        // 정답 리턴
        return answer;
    }
}