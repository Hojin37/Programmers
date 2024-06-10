class Solution {
    public int[] solution(int[] num_list, int n) {
        // 정답 배열 선언 및 초기화 - 길이는 num_list와 같다
        int[] answer = new int[num_list.length];
        
        // 배열의 원소를 n만큼 왼쪽으로 밀기
        for(int i=0; i<num_list.length; i++){
            int newIndex = (i + (num_list.length - n)) % num_list.length;
            answer[newIndex] = num_list[i];
        }
        
        // 정답 리턴
        return answer;
    }
}