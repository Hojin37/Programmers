class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long price1 = 0;
        long total = 0;
        while (count>0){
            price1 += price;
            total += price1;
            count--;
        }
        answer = ((total-money)>0) ? total-money : 0;
        return answer;
    }
}