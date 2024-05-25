import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // ArrayList 선언 및 초기화
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 정답 배열 선언 및 초기화
        int[] answer = {};
        // 닫힌 구간만큼 list에 추가하는 for문
        for(int j=0; j<2; j++){
            for(int i=0; i<arr.length; i++){
                if(intervals[j][0] <=i && i<= intervals[j][1]){
                    list.add(arr[i]); 
                }
            }
        }
        
        // list를 answer배열에 삽입
        answer = list.stream().mapToInt(i->i).toArray();
        
        // 정답 리턴
        return answer;
    }
}