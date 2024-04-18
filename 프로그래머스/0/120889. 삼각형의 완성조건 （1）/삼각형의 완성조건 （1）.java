class Solution {
    public int solution(int[] sides) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 가장 긴 변의 길이를 배열의 첫번째 수로 선언 및 초기화
        int longest = sides[0];
        // 세 변의 모든 길이를 합한 수인 total 선언 및 초기화
        int total = 0;
        
        // 배열 sides를 분석하기 위한 for문
        for(int i=0; i<sides.length; i++){
            total += sides[i];
            if(sides[i] > longest){
                longest = sides[i];
            }
        }
        // 두 변의 길이의 합이 가장 긴 변보다 길 경우 1을 리턴
        if(total-longest > longest){
            answer = 1;
        // 아닐경우 2를 리턴
        } else {
            answer = 2;
        }
        
        // 정답 리턴
        return answer;
    }
}