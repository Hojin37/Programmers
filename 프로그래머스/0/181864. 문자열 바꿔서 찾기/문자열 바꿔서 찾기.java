class Solution {
    public int solution(String myString, String pat) {
        // 정답 선언 및 초기화 - pat가 없을경우 0
        int answer = 0;
        // replace를 세 번 실행해 A와 B를 바꾼다
        String str = "";
        // B로 변환시 구별하기 위해 일단 0으로 변경
        str = myString.replace("A", "0");
        str = str.replace("B", "A");
        // 마지막으로 0을 B로 변경
        str = str.replace("0", "B");
        
        // if contains문으로 pat를 포함하는지 확인 - 포함하면 answer = 1 아니면 그대로
        if(str.contains(pat)){
            answer = 1;
        }
        
        // 정답 리턴
        return answer;
    }
}