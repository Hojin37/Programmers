import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        // ArrayList 선언 및 초기화
        ArrayList<String> list = new ArrayList<String>();
        // 정답 선언 및 초기화
        String[] answer = {};

        // 접미사를 순서대로 list에 add하는 for문
        for(int i=my_string.length()-1; i>=0; i--){
            list.add(my_string.substring(i, my_string.length()));
        }
        
        // list를 answer배열에 저장
        answer = list.toArray(answer);
        // answer배열을 정렬
        Arrays.sort(answer);
        
        // 정답 리턴
        return answer;
    }
}