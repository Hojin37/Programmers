class Solution {
    public int[] solution(int n, int[] numlist) {
        // 정답 배열의 길이를 미리 초기화 -> 가변길이 배열 안쓰려고
        int answerlength = 0;
        // 정답 배열에 수를 넣기 위한 index 선언 및 초기화
        int index = 0;
        
        // answerlength의 길이를 구하기 위한 for문
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                answerlength++;
            }
        }
        
        // 구한 배열의 길이로 정답 선언 및 초기화
        int[] answer = new int[answerlength];
        
        // 정답 배열에 수 넣기
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n ==0){
                answer[index] = numlist[i];
                index++;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}