import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        // arrayList 선언 및 초기화
        ArrayList<String> list = new ArrayList<String>();
        // 정답 선언 및 초기화
        String[] answer = {};
        // 놀이기구 맨 앞 사람들을 찾아낼 for문
        for(int i=0; i<names.length; i++){
            if(i%5 == 0){
                list.add(names[i]);
            }
        }
        // 정답 배열에 arrayList 넣기
        answer = list.toArray(new String[list.size()]);
        
        // 정답 리턴
        return answer;
    }
}