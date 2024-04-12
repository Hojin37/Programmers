class Solution {
    public String solution(String rsp) {
        // 정답 선언 및 초기화
        String answer = "";
        // String rsp를 char 배열로 변경
        char[] arr = rsp.toCharArray();
        // rsp를 이기는 수를 저장할 char 배열
        char[] arr2 = new char[arr.length];
        
        // arr을 분석할 for문
        for(int i=0; i<arr.length; i++){
            // rsp가 바위일 경우
            if(arr[i]=='0'){
                arr2[i] = '5';
            // rsp가 가위일 경우
            } else if(arr[i]=='2'){
                arr2[i] = '0';
            // rsp가 보일 경우
            } else if(arr[i]=='5'){
                arr2[i] = '2';
            }
        }
        // char 배열을 문자열로 변환
        answer = String.valueOf(arr2);
        
        // 정답 출력
        return answer;
    }
}