class Solution {
    public int solution(String[] babbling) {
        // 정답 선언 및 초기화
        int answer = 0;
        
        // babbling을 분석할 for문
        // 발음의 문자열을 제거 -> 제거 후 발음이 생성되지 않도록 공백으로 제거
        for(int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            // trim() 메소드로 문자열의 앞 뒤 공백을 모두 제거 => 빈 문자열일 경우 정답에 1 추가
            if(babbling[i].trim().equals("")){
                answer++;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}