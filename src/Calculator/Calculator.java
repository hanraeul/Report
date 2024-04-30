package Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> results; // 연산 결과를 저장하는 컬렉션 타입 필드

    public Calculator() {
        this.results = new ArrayList<>(); // 연산 결과를 저장할 ArrayList 생성
    }

    public double calculate(int num1, int num2, char op) throws ArithmeticException, IllegalArgumentException {
        double result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("분모에 0이 올 수 없습니다.");
                }
                result = (double) num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("올바른 연산자를 입력하세요.");
        }

        results.add(result); // 연산 결과를 컬렉션에 추가
        return result;
    }
}

