class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        // 정답 선언 및 초기화
        String answer = "";
        // my_strings에서 parts의 부분만을 잘라서 answer에 더하는 for문
        for(int i=0; i<my_strings.length; i++){
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }
        
        // 정답 리턴
        return answer;
    }
}