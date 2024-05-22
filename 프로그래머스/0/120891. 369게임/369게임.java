class Solution {
    public int solution(int order) {
        // 정답 선언 및 초기화
        int answer = 0;
        // int order을 char배열로 변환
        char[] arr = (order + "").toCharArray();
        // arr을 분석해 머쓱이의 박수 횟수를 구하는 for문
        for(int i=0; i<arr.length; i++){
            if(Character.getNumericValue(arr[i]) != 0 && Character.getNumericValue(arr[i])%3 == 0){
                answer += 1;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}