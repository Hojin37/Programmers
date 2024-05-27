class Solution {
    public String solution(String str1, String str2) {
        // 정답 선언 및 초기화
        String answer = "";
        // 두 문자열을 char배열로 변환
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();
        
        // 두 문자열을 한 글자씩 섞어서 answer에 더하는 for문 - 두 문자열은 길이가 같다
        for(int i=0; i<charStr1.length; i++){
            answer += charStr1[i] + "" + charStr2[i];
        }
        
        // 정답 리턴
        return answer;
    }
}