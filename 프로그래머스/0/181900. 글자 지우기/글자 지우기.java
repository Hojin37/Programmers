class Solution {
    public String solution(String my_string, int[] indices) {
        // 정답 선언 및 초기화
        String answer = "";
        // my_string을 char배열로 변환
        char[] arr = my_string.toCharArray();
        
        // my_string에서 indices의 원소에 해당하는 문자를 제외하고 answer에 추가하는 for문 - outer: 사용
        outer:
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<indices.length; j++){
                // i가 indices 배열 안에 있으면 i를 넘어가고 바깥 for문 다시 실행
                if(i == indices[j]){
                    continue outer;
                }
            }
            answer += arr[i];
        }
        
        // 정답 리턴
        return answer;
    }
}