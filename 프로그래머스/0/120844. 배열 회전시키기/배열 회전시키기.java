class Solution {
    public int[] solution(int[] numbers, String direction) {
        // 정답 선언 및 초기화
        int[] answer = new int[numbers.length];
        // 임시로 수를 저장할 temp 선언 및 초기화
        int rightTemp = numbers[numbers.length-1];
        int leftTemp = numbers[0];
        
        // 배열을 회전시키기 위한 for문
        for(int i=1; i<numbers.length; i++){
            if(direction.equals("right")){
                answer[i] = numbers[i-1];
                answer[0] = rightTemp;
            } else {
                if(i<numbers.length){
                    answer[i-1] = numbers[i];
                }
                answer[numbers.length-1] = leftTemp;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}