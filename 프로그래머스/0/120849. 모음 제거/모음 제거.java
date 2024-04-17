import java.util.ArrayList;

class Solution {
    public String solution(String my_string) {
        // 정답 선언 및 초기화
        String answer = "";
        // my_string을 char배열로 바꾼 arr 선언
        char[] arr = my_string.toCharArray();
        
        // 배열 arr과 알파벳 모음을 비교할 for문
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 'a' && arr[i] !='e' && arr[i] !='i' && arr[i] !='o' && arr[i] !='u'){
                answer += arr[i];
            }
        }

        // 정답 출력
        return answer;
    }
}