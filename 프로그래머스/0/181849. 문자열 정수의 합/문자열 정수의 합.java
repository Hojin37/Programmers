class Solution {
    public int solution(String num_str) {
        // 정답 선언 및 초기화
        int answer = 0;
        // num_str을 char배열로 변환한 arr선언 및 초기화
        char[] arr = num_str.toCharArray();
        
        // arr의 모든 char를 int로 변환해 더하는 for문
        for(int i=0; i<arr.length; i++){
            answer += Character.getNumericValue(arr[i]);
        }
        
        // 정답 리턴
        return answer;
    }
}