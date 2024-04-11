class Solution {
    public int solution(int price) {
        // 정답 선언 및 초기화
        int answer = 0;
        // 가격별 할인을 구분하기 위한 if문
        // 10만원 이상일 경우 5% 할인
        if(100000<=price && price<300000) {
            answer = (price*95)/100;
        // 30만원 이상일 경우 10% 할인
        } else if(300000<=price && price<500000) {
            answer = (price*90)/100;
        // 50만원 이상일 경우 20% 할인
        } else if(price>=500000) {
            answer = (price*80)/100;
        // 10만원 미만일 경우 정가
        } else {
            answer = price;
        }
        
        // 정답 출력
        return answer;
    }
}