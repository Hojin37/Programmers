class Solution {
    public String solution(String my_string, int[] index_list) {
        // 정답 선언 및 초기화
        String answer = "";
        // index_list의 인덱스를 정렬해 answer에 차례로 저장하는 for문
        for(int i=0; i<index_list.length; i++){
            answer += my_string.charAt(index_list[i]);
        }
        
        // 정답 리턴
        return answer;
    }
}