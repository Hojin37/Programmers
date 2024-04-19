// ArrayList를 사용하기 위해 import
import java.util.ArrayList;
// 오름차순 정렬 Arrays.sort()를 사용하기 위해 import
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        // 정답 배열 선언 및 초기화
        ArrayList<Integer> answerList = new ArrayList<>();
        // my_string을 char배열로 변경
        char[] arr = my_string.toCharArray();
        // char 숫자만 담긴 배열 num 선언 및 초기화
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        
        // arr에서 숫자를 빼내기 위한 for문
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<num.length; j++){
                if(arr[i] == num[j]){
                    answerList.add(Character.getNumericValue(num[j]));
                    break;
                }
            }
        }
        
        // answer 배열을 선언
        int[] answer = new int[answerList.size()];
        // arrayList를 다시 int배열로 변경
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        // 변경한 배열을 오름차순으로 변경 
        Arrays.sort(answer);
        
        // 정답 리턴
        return answer;
    }
}