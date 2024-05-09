import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 입력받는 스캐너 선언 및 초기화
        Scanner sc = new Scanner(System.in);
        // 입력받은 값 n에 입력
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.print(n + " is even");
        } else {
            System.out.print(n + " is odd");
        }
    }
}