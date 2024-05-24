class Solution {
    public int solution(String my_string, String is_suffix) {
        // 정답 선언 및 초기화
        int answer = 0;
        // is_suffix의 길이만큼 my_string의 뒷부분 문자열과 비교
        if(my_string.length() >= is_suffix.length() && my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix)){
            answer = 1;
        }
        
        // 정답 리턴
        return answer;
    }
}