class Solution {
    public int solution(String myString, String pat) {
        // 정답 선언 및 초기화
        int answer = 0;
        
        // pat길이만큼의 myString과 pat를 비교하는 for문
        for(int i=0; i<= myString.length() - pat.length(); i++){
            if(myString.substring(i, i + pat.length()).equals(pat)){
                answer++;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}