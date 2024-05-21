class Solution {
    public boolean solution(int x) {
        // 정답 선언 및 초기화
        boolean answer = true;
        // 자릿수의 합 n선언 및 초기화
        int n = 0;
        // x를 String으로 변환한 xStr선언 및 초기화
        String xStr = x + "";
        // xStr을 char배열로 변환
        char[] arr = xStr.toCharArray();
        // arr의 모든 수를 더하는 for문
        for(int i=0; i<arr.length; i++){
            n += Character.getNumericValue(arr[i]);
        }
        // x가 하사드 수인지 확인
        answer = (x%n == 0) ? true : false;
        
        // 정답 리턴
        return answer;
    }
}