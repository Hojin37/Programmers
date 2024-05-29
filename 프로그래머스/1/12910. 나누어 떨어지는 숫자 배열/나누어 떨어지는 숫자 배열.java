import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // ArrayList list 선언 및 초기화
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 정답 배열 선언 및 초기화
        int[] answer = {};
        
        // 배열 arr에서 divisor로 나누어 떨어지는 값 구해 list에 add하는 for문
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
            } 
        }
        // 추가된 수가 없을 경우 리스트에 -1을 추가
        if(list.size() == 0){
            list.add(-1);
        }
        
        // 리스트를 배열로 변환
        answer = list.stream().mapToInt(i->i).toArray();
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(answer);
        
        // 정답 리턴
        return answer;
    }
}