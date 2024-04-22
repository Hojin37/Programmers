class Solution {
    public int solution(int[][] dots) {
        // 정답 선언 및 초기화 정답은 1 아니면 0
        int answer = 0;
        // 세가지 경우의 수의 기울기를 선언 및 초기화
        int x11 = dots[0][0] - dots[1][0];
        int x12 = dots[2][0] - dots[3][0];
        int x21 = dots[0][0] - dots[2][0];
        int x22 = dots[1][0] - dots[3][0];
        int x31 = dots[0][0] - dots[3][0];
        int x32 = dots[1][0] - dots[2][0];
        
        double incline11 = (dots[0][1] - dots[1][1]) / (double)x11;
        double incline12 = (dots[2][1] - dots[3][1]) / (double)x12;
        double incline21 = (dots[0][1] - dots[2][1]) / (double)x21;
        double incline22 = (dots[1][1] - dots[3][1]) / (double)x22;
        double incline31 = (dots[0][1] - dots[3][1]) / (double)x31;
        double incline32 = (dots[1][1] - dots[2][1]) / (double)x32;
        
        if(x11 < 0){incline11 = (dots[1][1] - dots[0][1]) / (double)-x11;} 
        if(x12 < 0){incline12 = (dots[3][1] - dots[2][1]) / (double)-x12;} 
        if(x21 < 0){incline21 = (dots[2][1] - dots[0][1]) / (double)-x21;} 
        if(x22 < 0){incline22 = (dots[3][1] - dots[1][1]) / (double)-x22;} 
        if(x31 < 0){incline31 = (dots[3][1] - dots[0][1]) / (double)-x31;} 
        if(x32 < 0){incline32 = (dots[2][1] - dots[1][1]) / (double)-x32;} 
        
        // 기울기가 같을 경우 평행으로 간주 answer = 1
        if(incline11 == incline12 || incline21 == incline22 || incline31 == incline32){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}