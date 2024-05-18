class Solution {
    public int solution(String number) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 모든 자리 수의 합인 int total선언 및 초기화
        int total = 0;
        // String number을 char배열로 변환
        char[] arr = number.toCharArray();
        // arr의 각 자리 수를 모두 더하는 for문
        for(int i=0; i<arr.length; i++){
            total += Character.getNumericValue(arr[i]);
        }
        
        // total을 9로 나눈 나머지를 answer에 입력
        answer = total%9;
        
        // 정답 리턴
        return answer;
    }
}