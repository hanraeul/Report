package Calculator;//package Calculator;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Out = null;
        double [] results = new double [10];
        int count = 0;

        do {
                System.out.println("첫 번째 숫자를 입력하세요");
                int Number1 = sc.nextInt();
                System.out.println("두 번째 숫자를 입력하세요");
                int Number2 = sc.nextInt();

                sc.nextLine();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char Text = sc.nextLine().charAt(0);

                double result = calculate(Number1, Number2, Text);

                System.out.println("결과 : " + result);

                System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");


                Out = sc.next();

                results[count] = result;
                count ++;

        }
        while (!"exit".equalsIgnoreCase(Out) && count < 10); // exit를 입력하거나

        for(int i = 0; i < count ; i++) {
            System.out.println("배열값" + results[i]);  // 배열에 저장된값 정상출력 확인
        }

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