import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        // ArrayList list 선언 및 초기화
        ArrayList<String> list = new ArrayList<String>();
        // 정답 배열 선언 및 초기화
        String[] answer = {};
        
        // "ad"라는 부분 문자열을 제외하고 list에 담기 위한 for문
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                list.add(strArr[i]);
            }
        }
        // list를 answer배열에 저장
        answer = list.toArray(new String[0]);
        
        // 정답 리턴
        return answer;
    }
}