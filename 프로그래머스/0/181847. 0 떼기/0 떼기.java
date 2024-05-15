class Solution {
    public String solution(String n_str) {
        // 정답 선언 및 초기화
        String answer = "";
        // 0이 아닌 문자가 나타나는 부분의 index를 선언 및 초기화
        int index = 0;
        // n_str을 char배열로 변환
        char[] arr = n_str.toCharArray();
        
        // 앞부분부터 '0'이 아닌 문자가 나타나면 그 i를 index에 저장
        for(int i=0; i<arr.length; i++){
            if(arr[i] != '0'){
                index = i;
                break;
            }
        }   
        // 저장된 index부터 answer에 추가
        for(int j=index; j<arr.length; j++){
            answer += arr[j];
        }
        
        // 정답 리턴
        return answer;
    }
}
