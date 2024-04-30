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
        char Text = sc.nextLine().charAt(0);

        double result = calculate( Number1,  Number2,  Text);

        System.out.println("결과 : " + result);

    }

    public static double calculate(int num1, int num2, char text) {
        int result = 0;
        switch (text) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                if(num2 != 0) {
                    result = num1 / num2;
                }
                else {
                    System.out.println("0이 입력될 수 없습니다.");
                }
                break;
        }


        return result;
    }


}