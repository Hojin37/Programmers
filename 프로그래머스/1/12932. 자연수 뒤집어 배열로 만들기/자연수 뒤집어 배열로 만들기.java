import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(long n) {
        // n을 문자열로 변환
        String nStr = n + "";
        // 문자열 뒤집기 - StringBuilder이용
        StringBuilder str = new StringBuilder(nStr).reverse();
        // n을 문자열로 변환해 char배열로 변환 
        char[] arr = (str.toString()).toCharArray();
        // 정답 배열 선언 및 초기화
        int[] answer = new int[arr.length];
        // char배열을 int값으로 변환해 answer배열에 저장하는 for문
        for(int i=0; i<arr.length; i++){
            answer[i] = Character.getNumericValue(arr[i]);
        }
        
        // 정답 리턴
        return answer;
    }
}