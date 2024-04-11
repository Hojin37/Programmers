class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 정답 선언 및 초기화
        int[] answer = new int[2];
        // 두 분수 더하기
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;
        // 두 수의 최대공약수 가져오기
        int gcd = gcd(numer, denom);
        // 최대공약수로 나누기
        numer/=gcd;
        denom/=gcd;
        // 결과 저장하기
        answer[0] = numer;
        answer[1] = denom;
        // 정답출력
        return answer;
    }
    // 최대공약수 찾기
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}