import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 할 일 목록을 담을 arrayList 선언 및 초기화
        ArrayList<String> list = new ArrayList<String>();
        // 정답 배열 선언 및 초기화
        String[] answer = {};
        // todo_list와 finished를 비교할 for문
        for(int i=0; i<todo_list.length; i++){
            if(finished[i] == false){
                list.add(todo_list[i]);
            }
        }
        answer = list.toArray(new String[list.size()]);
        
        // 정답 리턴
        return answer;
    }
}