class Solution {
    public String solution(String n_str) {
        // 정답 선언 및 초기화
        String answer = "";
        int index = 0;
        // n_str을 char배열로 변환
        char[] arr = n_str.toCharArray();
        // 앞부분의 "0"문자들을 제거하기 위한 for문
        for(int i=0; i<arr.length; i++){
            if(arr[i] != '0'){
                index = i;
                break;
            }
        }   
        for(int j=index; j<arr.length; j++){
            answer += arr[j];
        }
        
        // 정답 리턴
        return answer;
    }
}