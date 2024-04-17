class Solution {
    public int solution(int[] numbers) {
        // 정답 선언 및 초기화
        int answer = 0;
        // numbers에서 가장 큰 수 max_num1를 첫번째 배열의 수로 선언 및 초기화
        int max_num1 = numbers[0];
        // number에서 두번째로 큰 수 max_num2을 0으로 선언 및 초기화
        int max_num2 = 0;
        
        // numbers에서 max_num1과 max_num2를 찾기 위한 for문
        for(int i=1; i<numbers.length; i++){
            // 만약 현재의 numbers[i]가 max_num1보다 클 경우 max_num1의 값을 max_num2로 전송 후 현재값으로 변경
            if(numbers[i] > max_num1){
                max_num2 = max_num1;
                max_num1 = numbers[i];
            // 만약 numbers[i]가 max_num1보다 크지 않으나 max_num2보단 클 경우, max_num2의 값으로 입력
            } else if(numbers[i] > max_num2){
                max_num2 = numbers[i];
            }
        }
        
        // 두 수 곱하기
        answer = max_num1 * max_num2;
        
        // 정답 출력
        return answer;
    }
}