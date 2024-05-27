import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 두 문자열을 char배열로 변환]
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        // 두 배열 정렬
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        // 두 배열을 비교해 같을경우 1 입력
        answer = (Arrays.equals(beforeArr, afterArr)) ? 1 : 0;
        
        // 정답 리턴
        return answer;
    }
}