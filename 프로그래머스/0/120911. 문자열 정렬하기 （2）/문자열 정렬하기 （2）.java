import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // 정답 선언 및 초기화
        String answer = "";
        // my_string을 모두 소문자로 변환
        my_string = my_string.toLowerCase();
        // my_string을 char배열로 변환
        char[] arr = my_string.toCharArray();
        // arr을 정렬
        Arrays.sort(arr);
        // arr을 String으로 변환해 answer에 입력하는 for문
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}