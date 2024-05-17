class Solution {
    public String solution(String myString) {
        // 정답 선언 및 초기화
        String answer = "";
        // myString을 char 배열로 변환해 선언 및 초기화
        char[] arr = myString.toCharArray();
        
        // for문 - 아스키코드로 변환해 'l'의 아스키코드보다 작을경우 'l'로 바꿔서 추가하기
        for(int i=0; i<arr.length; i++){
            if((int)arr[i] < (int)('l')){
                answer += 'l';
            } else {
                answer += arr[i];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}