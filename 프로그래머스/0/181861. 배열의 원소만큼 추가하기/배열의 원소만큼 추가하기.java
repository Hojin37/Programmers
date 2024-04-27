import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        // 정답 선언 및 초기화
        int[] answer = {};
        // 값을 추가할 arrayList 선언 및 초기화
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        // arr을 분석해 answer에 추가할 for문
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                arr2.add(arr[i]);
            }
        }
        
        answer = arr2.stream().mapToInt(Integer::intValue).toArray();
        
        // 정답 리턴
        return answer;
    }
}