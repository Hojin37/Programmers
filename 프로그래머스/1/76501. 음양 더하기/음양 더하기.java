class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        // 정답 선언 및 초기화
        int answer = 0;
        // absolutes와 signs를 비교해 실제 정수들의 합을 구하는 for문
        for(int i=0; i<signs.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        
        // 정답 리턴
        return answer;
    }
}