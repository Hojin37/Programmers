class Solution {
    public int solution(String my_string, String is_prefix) {
        // 정답 선언 및 초기화
        int answer = 0;
        
        // 접두사를 구하기 위해 is_prefix를 문자열 "0"으로 변경
        my_string = my_string.replace(is_prefix, "0");
        // 변경한 문자열의 첫 번째 문자를 구해 "0"일 경우 answer를 1로 변경
        if(my_string.substring(0, 1).equals("0")){
            answer = 1;
        }
        
        // 정답 리턴
        return answer;
    }
}