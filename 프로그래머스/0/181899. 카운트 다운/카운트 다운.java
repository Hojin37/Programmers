import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = start_num;
        
        for(int i=end_num; i<=start_num; i++){
            list.add(n);
            n--;
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}