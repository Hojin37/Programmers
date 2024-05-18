import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 스캐너 선언 및 초기화
        Scanner sc = new Scanner(System.in);
        // 스캐너로 입력받은 값을 str에 저장
        String str = sc.next();
        // 스캐너로 두번째 입력받은 값을 n에 저장
        int n = sc.nextInt();
        // 정답 선언 및 초기화
        String answer = "";
        // n만큼 문자열을 반복하는 while문
        while(n>0){
            answer += str;
            n -= 1;
        }
        // 출력
        System.out.println(answer);
    }
}