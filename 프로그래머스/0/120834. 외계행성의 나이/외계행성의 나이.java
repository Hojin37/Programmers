class Solution {
    public String solution(int age) {
        // 정답 선언 및 초기화
        String answer = "";
        // int age를 String으로 변경
        String age_string = age + "";
        // int age를 char 배열로 변경
        char[] arr = age_string.toCharArray();
        // 나이를 분석할 for문
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '0'){
                answer += "a";
            } if(arr[i] == '1'){
                answer += "b";
            } if(arr[i] == '2'){
                answer += "c";
            } if(arr[i] == '3'){
                answer += "d";
            } if(arr[i] == '4'){
                answer += "e";
            } if(arr[i] == '5'){
                answer += "f";
            } if(arr[i] == '6'){
                answer += "g";
            } if(arr[i] == '7'){
                answer += "h";
            } if(arr[i] == '8'){
                answer += "i";
            } if(arr[i] == '9'){
                answer += "j";
            }
        }
        
        
        // 정답 리턴
        return answer;
    }
}