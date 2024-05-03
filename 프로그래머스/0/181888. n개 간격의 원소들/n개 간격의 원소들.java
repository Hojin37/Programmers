import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // ArrayList 선언 및 초기화
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 정답 배열 선언 및 초기화
        int[] answer = {};
        
        // 간격마다 값을 가져오기 위한 for문
        for(int i=0; i<num_list.length; i++){
            if(i%n == 0){
                list.add(num_list[i]);
            }
        }
        // Integer list를 int 배열로 변경
        answer = list.stream().mapToInt(i -> i).toArray();
        
        // 정답 리턴
        return answer;
    }
}