class Solution {
    public int solution(String my_string, String target) {
        // 정답 선언 및 초기화
        int answer = 0;
        // contains()메서드로 부분 문자열인지 확인
        if(my_string.contains(target)){
            answer = 1;
        }
        
        // 정답 리턴
        return answer;
    }
}