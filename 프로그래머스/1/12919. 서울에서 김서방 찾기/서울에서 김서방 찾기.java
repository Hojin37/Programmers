class Solution {
    public String solution(String[] seoul) {
        // 정답 선언 및 초기화
        String answer = "";
        // 김서방의 index를 찾는 for문
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }
        }
        
        // 정답 리턴
        return answer;
    }
}