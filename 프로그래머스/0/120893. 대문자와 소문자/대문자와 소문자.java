class Solution {
    public String solution(String my_string) {
        // 정답 선언 및 초기화
        String answer = "";
        // my_string을 char배열로 바꾼 arr선언 및 초기화
        char[] arr = my_string.toCharArray();
        
        // arr을 분석하기 위한 for문
        for(int i=0; i<arr.length; i++){
            // 아스키 코드로 변경 후 대문자와 소문자 변환
            if((int)arr[i] <= 90){
                arr[i] = (char)(arr[i] + 32);
            } else {
                arr[i] = (char)(arr[i] - 32);
            }
        }
    
        // 변환된 배열을 정답에 입력
        answer = String.valueOf(arr);
        // 정답 리턴
        return answer;
    }
}