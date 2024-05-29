class Solution {
    public String solution(String phone_number) {
        // 정답 선언 및 초기화
        String answer = "";
        // phone_number를 char배열로 변환
        char[] arr = phone_number.toCharArray();
        
        // 핸드폰 번호 뒤 4자리 수를 제외하고 전부 *로 가리는 for문
        for(int i=0; i<phone_number.length(); i++){
            if(i<phone_number.length() - 4){
                answer += "*";
            } else {
                answer += arr[i];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}