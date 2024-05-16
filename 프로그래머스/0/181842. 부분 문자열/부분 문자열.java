class Solution {
    public int solution(String str1, String str2) {
//         // 정답 선언 및 초기화
//         int answer = 0;
//         // contains()메서드로 str1이 str2의 부분 분자열인지 확인
//         if(str2.contains(str1)){
//             answer = 1;
//         }
        
//         // 정답 리턴
//         return answer;
        
        // 한줄로 풀기
        return (str2.contains(str1)) ? 1 : 0;
    }
}