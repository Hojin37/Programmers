class Solution {
    public String solution(String my_string, int num1, int num2) {
        // 정답 String 선언 및 초기화
        String answer = "";
        // 바꿀 index를 저장할 tmp 선언 및 초기화
        char tmp = ' ';
        // my_string을 char 배열로 변경
        char[] arr = my_string.toCharArray();
        
        // 인덱스를 서로 바꾸기 위한 for문
        for(int i=0; i<arr.length; i++){
            if(i==num1){
                tmp = arr[i];
                arr[i] = arr[num2];
            } if(i==num2){
                arr[i] = tmp;
            }
            answer += arr[i];
        }
        
        // 정답 리턴
        return answer;
    }
}