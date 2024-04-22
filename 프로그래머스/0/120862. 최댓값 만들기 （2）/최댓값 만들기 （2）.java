import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 배열 오름차순 정렬
        Arrays.sort(numbers);
        
        // 오름차순으로 정렬한 배열에서 맨 처음 두 수가 맨 마지막 두 수의 곱보다 클 경우
        if(numbers[0]*numbers[1] > numbers[numbers.length-1]*numbers[numbers.length-2]){
            answer = numbers[0]*numbers[1];
        } else {
            answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        }
        
        // 정답 리턴
        return answer;
    }
}