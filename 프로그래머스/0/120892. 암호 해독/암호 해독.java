class Solution {
    public String solution(String cipher, int code) {
        // 정답 선언 및 초기화
        String answer = "";
        // cipher을 char배열로 변경
        char[] cipherArr = cipher.toCharArray();
        
        // cipherArr의 암호를 해독하기 위한 for문
        for(int i=0; i<cipherArr.length; i++){
            // code의 배수 문자일 경우 answer에 추가
            if(i%code == code-1){
                answer += cipherArr[i];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}