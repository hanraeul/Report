package Calculator;//package Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Out = null;
        List<Double> results = new ArrayList<>();

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

//                // 1-6 결과 값을 한 칸씩 앞으로 이동시키기
//                if (count >= 10) {
//                    for (int i = 0; i < 9; i++) {
//                        results[i] = results[i + 1];
//                    }
//                    count = 9; // count를 9로 설정하여 배열의 마지막 인덱스에 저장
//                }

                results.add(result); // 연산 결과를 ArrayList에 추가

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String input = sc.nextLine();
                if ("remove".equalsIgnoreCase(input) && !results.isEmpty()) {
                results.remove(0); // 리스트의 첫 번째 요소 삭제
                }

                System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                input = sc.nextLine();
                if ("inquiry".equalsIgnoreCase(input)) {
                     System.out.println("저장된 연산 결과:");
                        for (double res : results) {
                            System.out.println(res);
                        }
                }


                Out = sc.next();

//                results[count] = result; // 배열에 결과값 저장

        }
        while (!"exit".equalsIgnoreCase(Out));

//        for(int i = 0; i < count ; i++) {
//            System.out.println("배열값" + results[i]);  // 배열에 저장된값 정상출력 확인
//        }

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