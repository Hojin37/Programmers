class Solution {
    public String solution(String rny_string) {
        // 정답 선언 및 초기화 - replace를 이용해 m을 rn으로 바꾼다
        String answer = rny_string.replace("m", "rn");
        
        // 정답 리턴
        return answer;
    }
}