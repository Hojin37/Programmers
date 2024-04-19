import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 입력받을 Scanner 선언 및 초기화
        Scanner sc = new Scanner(System.in);
        // 입력받은 값을 n에 입력
        int n = sc.nextInt();
        // 별을 찍을 String star 선언 및 초기화
        String star = "";
        
        // 삼각형을 만들어서 출력할 for문
        for(int i=0; i<n; i++){
            star += "*";
            System.out.println(star);
        }
    }
}