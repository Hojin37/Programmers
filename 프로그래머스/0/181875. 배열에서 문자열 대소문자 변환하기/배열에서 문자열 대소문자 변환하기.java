class Solution {
    public String[] solution(String[] strArr) {
        // 배열 선언 및 초기화 - 배열의 길이는 strArr과 같음
        String[] answer = new String[strArr.length];
        // 홀수번째와 짝수번째를 구분해 적용할 for문 - toUpperCase() & toLowerCase() 사용
        for(int i=0; i<strArr.length; i++){
            if(i%2 == 0){
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }
            
        // 정답 리턴
        return answer;
    }
}