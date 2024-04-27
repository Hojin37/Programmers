class Solution {
    public int solution(int[] arr1, int[] arr2) {
        // 정답 선언 및 초기화 0일 경우 두 배열이 같음
        int answer = 0;
        // 배열의 길이를 먼저 비교
        if(arr1.length > arr2.length){
            answer = 1;
        } else if(arr1.length < arr2.length){
            answer = -1;
        // 두 배열의 길이가 같을 경우
        } else{
            int arr1Total = 0;
            int arr2Total = 0;
            // 두 배열의 길이가 같으므로 하나의 for문으로 계산 가능
            for(int i=0; i<arr1.length; i++){
                arr1Total += arr1[i];
                arr2Total += arr2[i];
            }
            // 두 배열의 합이 같을 경우 0이므로 answer을 새로 계산하지 않음
            // 같지 않을 경우
            if(arr1Total != arr2Total){
                answer = (arr1Total > arr2Total) ? 1 : -1;
            }
        }
        
        // 정답 리턴
        return answer;
    }
}