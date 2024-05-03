import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // ArrayList 선언 및 초기화
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 정답 배열 선언 및 초기화
        int[] answer = {};
        
        // 첫 번째 원소부터의 모든 원소를 list에 담을 for문
        for(int i=0; i<num_list.length; i++){
            if(i < n){
                list.add(num_list[i]);
            }
        }
        // list를 int 배열에 입력
        answer = list.stream().mapToInt(i->i).toArray();
        
        // 정답 리턴
        return answer;
    }
}