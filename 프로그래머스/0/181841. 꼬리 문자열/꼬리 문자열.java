class Solution {
    public String solution(String[] str_list, String ex) {
        // 정답 선언 및 초기화
        String answer = "";
        // contains로 비교해 포함하지 않을 경우 answer에 추가하는 for문
        for(int i=0; i<str_list.length; i++){
            if(!str_list[i].contains(ex)){
                answer += str_list[i];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}