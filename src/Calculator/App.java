package Calculator;//package Calculator;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요");
        int Number1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요");
        int Number2 = sc.nextInt();

        sc.nextLine();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char text = sc.nextLine().charAt(0);

        System.out.println(Number1 + Number2);

    }

}