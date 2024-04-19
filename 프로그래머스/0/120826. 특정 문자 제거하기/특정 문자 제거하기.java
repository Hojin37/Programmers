class Solution {
    public String solution(String my_string, String letter) {
        // 정답 선언 및 초기화
        String answer = "";
        // my_string을 char배열로 변경
        char[] arr = my_string.toCharArray();
            
        // letter와 arr을 비교하기 위한 for문
        for(int i=0; i<arr.length; i++) {
            if (!(arr[i] + "").equals(letter)) {
                answer += arr[i];
            }
        }
        
        // 정답 출력
        return answer;
    }
}