class Solution {
    public int solution(int[] num_list) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 홀수와 짝수를 더하지 않고 이어붙일 String 선언 및 초기화 - 이어붙인 후에 형변환
        String even = "";
        String odd = "";
        
        // num_list의 홀수와 짝수를 분리할 for 문
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 == 0){
                even += num_list[i] + ""; 
            } else {
                odd += num_list[i] + "";
            }
        }
        // 짝수와 홀수를 이어붙인 문자열을 형변환해 더하기
        answer = Integer.valueOf(even) + Integer.valueOf(odd);
        
        // 정답 리턴
        return answer;
    }
}