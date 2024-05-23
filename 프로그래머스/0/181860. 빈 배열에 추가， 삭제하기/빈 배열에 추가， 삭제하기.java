import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        // ArrayList선언 및 초기화
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 정답 배열 선언 및 초기화
        int[] answer = {};
        // arr과 flag를 비교해 list에 add하는 for문
        for(int i=0; i<arr.length; i++){
            int cnt = arr[i];
            if(flag[i]){
                cnt *= 2;
                while(cnt>0){
                    list.add(arr[i]);
                    cnt -= 1;
                }
            } else {
                while(cnt>0){
                    list.remove(list.size() - 1);
                    cnt -= 1;
                }
            }
        }
        
        // list를 정답 배열에 삽입
        answer = list.stream().mapToInt(i->i).toArray();
        
        // 정답 리턴
        return answer;
    }
}