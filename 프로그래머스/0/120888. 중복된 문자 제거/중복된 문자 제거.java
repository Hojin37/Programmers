class Solution {
    public String solution(String my_string) {
        // 정답 선언 및 초기화
        String answer = "";
        // my_string을 char배열로 변환
        char[] arr = my_string.toCharArray();
        // 중복된 문자를 제거하기 위한 for문 - 앞 문자열에 포함될 경우 더하지 않음
        for(int i=0; i<arr.length; i++){
            if(!answer.contains(arr[i] + "")){
                answer += arr[i];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}