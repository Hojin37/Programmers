class Solution {
    public int solution(String str1, String str2) {
        // 정답 선인 및 초기화
        int answer = 0;
        // contains()로 문자열을 포함하고 있는지 확인
        if(str1.contains(str2)){
            answer = 1;
        } else {
            answer = 2;
        }
        
        // 정답 리턴
        return answer;
    }
}