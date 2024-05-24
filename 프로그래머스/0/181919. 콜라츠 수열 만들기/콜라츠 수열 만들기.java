import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        // ArrayList선언 및 초기화
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        // 정답 배열 선언 및 초기화
        int[] answer = {};
        // 첫번째 값을 먼저 list에 추가
        list.add(n);
        // 콜라츠 수열을 구하기 위한 while문
        while(n!=1){
            if(n%2==0){
                n /= 2;
                list.add(n);
            } else{
                n = 3 * n + 1;
                list.add(n);
            }
        }
        // list를 answer배열로 변환
        answer = list.stream().mapToInt(i->i).toArray();
        
        // 정답 리턴
        return answer;
    }
}