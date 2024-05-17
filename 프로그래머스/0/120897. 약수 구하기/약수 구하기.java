import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        // ArrayList 선언 및 초기화
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 정답 배열 선언 및 초기화
        int[] answer = {};
        
        // n의 약수를 찾아 list에 저장하는 for문
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        // list를 answer배열에 저장
        answer = list.stream().mapToInt(i->i).toArray();
        
        // 정답 리턴
        return answer;
    }
}