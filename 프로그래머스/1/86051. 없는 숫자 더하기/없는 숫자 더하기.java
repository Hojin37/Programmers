class Solution {
    public int solution(int[] numbers) {
        // 정답 선언 및 초기화 - 0부터 9까지의 합 선언 및 초기화
        int answer = 0;
        // 0부터 9까지의 합 구하기 - answer에 저장
        for(int i=0; i<=9; i++){
            answer += i;
        }
        // numbers배열과 비교해 포함되는 원소 빼기 - numbers의 모든 원소가 서로 다르기때문에 가능
        for(int j=0; j<numbers.length; j++){
            answer -= numbers[j];
        }
        
        // 정답 리턴
        return answer;
    }
}