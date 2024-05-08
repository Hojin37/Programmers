class Solution {
    public int solution(int n, String control) {
        // 정답 선언 및 초기화
        int answer = 0;
        // control을 char배열로 변환
        char[] arr = control.toCharArray();
        // control에 따라 값을 조작할 for문
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'w'){
                n++;
            } else if(arr[i] == 's'){
                n--;
            } else if(arr[i] == 'd'){
                n += 10;
            } else {
                n -= 10;
            }
        }
        // 정답에 n을 입력
        answer = n;
        
        // 정답 리턴
        return answer;
    }
}