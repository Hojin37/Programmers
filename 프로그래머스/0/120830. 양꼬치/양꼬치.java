class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        k = (k - n/10) * 2000;
        n = n * 12000;
        answer = n + k;
        return answer;
    }
}