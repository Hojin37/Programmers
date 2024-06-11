import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        // ArrayList list 선언 및 초기화
        ArrayList<Integer> list = new ArrayList<>();
        // 정답 배열 선언 및 초기화
        int[] answer = {};
        // myString을 char 배열로 변환해 선언 및 초기화
        char[] arr = myString.toCharArray();
        
        // 문자열 길이 자르기 위한 변수
        int count = 0;

        // "x"를 기준으로 문자열의 길이를 자르는 for문
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 'x'){
                count++;
            } else {
                list.add(count);
                count = 0; // 초기화
            }
        }
        // 마지막 부분 문자열 길이 추가
        list.add(count);
        
        answer = list.stream().mapToInt(i -> i).toArray();
        
        // 정답 리턴
        return answer;
    }
}