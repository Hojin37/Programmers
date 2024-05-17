class Solution {
    public int solution(int num, int k) {
        // 정답 선언 및 초기화 - 없을 때의 기본값을 -1로 초기화
        int answer = -1;
        // num을 char배열로 변환
        char[] arr = (num+"").toCharArray();
        
        // k가 있는지 찾아 인덱스를 리턴하는 for문
        for(int i=0; i<arr.length; i++){
            if(arr[i] == (char)(k+'0')){
                answer = i+1;
                break;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}