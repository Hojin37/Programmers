class Solution {
    public String solution(String my_string, int m, int c) {
        // 정답 선언 및 초기화
        String answer = "";
        // my_string을 char배열로 변환
        char[] arr = my_string.toCharArray();
        
        // my_string을 m글자씩 잘랐을 때, c번째에 있는 글자를 나열하는 for문
        for(int i=0; i<arr.length; i++){
            if(i%m + 1 == c)
            answer += arr[i];
        }
        
        // 정답 리턴
        return answer;
    }
}