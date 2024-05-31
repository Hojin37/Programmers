import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 스캐너 선언 및 초기화
        Scanner sc = new Scanner(System.in);
        // 처음으로 입력된 값을 a에 저장
        int a = sc.nextInt();
        // 다음으로 입력된 값을 b에 저장
        int b = sc.nextInt();

        // 출력
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}