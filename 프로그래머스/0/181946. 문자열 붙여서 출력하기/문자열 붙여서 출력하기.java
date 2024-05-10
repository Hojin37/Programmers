import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 문자 입력받을 스캐너 선언 및 초기화
        Scanner sc = new Scanner(System.in);
        // 첫 번째로 입력된 문자를 a에 대입
        String a = sc.next();
        // 그 다음으로 입력된 문자를 b에 대입
        String b = sc.next();
        
        // 출력하기
        System.out.print(a + b);
    }
}