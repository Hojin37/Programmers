class Solution {
    public int solution(String my_string) {
        // 정답 선언 및 초기화
        int answer = 0;
        // my_string을 char배열로 변경한 arr 선언 및 초기화
        char[] arr = my_string.toCharArray();
        // 자연수를 담은 배열 num 선언 및 초기화
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        // arr과 num을 비교하기 위한 for문
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<num.length; j++){
                if(arr[i] == num[j]){
                    answer += Character.getNumericValue(num[j]);
                }
            }
        }
        
        // 정답 리턴
        return answer;
    }
}