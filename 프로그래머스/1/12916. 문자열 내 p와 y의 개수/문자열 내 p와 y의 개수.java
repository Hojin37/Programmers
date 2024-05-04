class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // p와 y의 개수 선언 및 초기화
        int cntP = 0;
        int cntY = 0;
        // s를 char 배열로 변환한 arr선언 및 초기화
        char[] arr = s.toCharArray();
        
        // arr에서 p와 y의 갯수를 계산할 for문
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'p' || arr[i] == Character.toUpperCase('p')){
                cntP++;
            } else if(arr[i] == 'y' || arr[i] == Character.toUpperCase('y')){
                cntY++;
            }
        }
        // cntP와 cntY의 값을 비교
        answer = (cntP == cntY) ? true : false;

        // 정답 리턴
        return answer;
    }
}