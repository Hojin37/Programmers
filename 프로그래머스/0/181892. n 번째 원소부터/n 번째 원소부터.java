import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // ArrayList선언 및 초기화
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 정답 배열 선언 및 초기화
        int[] answer = {};
        
        // num_list를 분석해 list에 담을 for문
        for(int i=0; i<num_list.length; i++){
            if(i >= n-1){
                list.add(num_list[i]);
            }
        }
        // list를 answer 배열로 변환
        answer = list.stream().mapToInt(i->i).toArray();
        
        // 정답 리턴
        return answer;
    }
}