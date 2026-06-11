package com.example.calculator;

//import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calendar = new Calculator();
        long calendar0;
        String isFinished;
        do {
            Scanner s1 = new Scanner(System.in);
            System.out.print("계산시 첫번째로 사용할 정수를 입력하세요 : ");
            long firstNumber = s1.nextLong();
            System.out.print("계산시 연산자로 사용 할것을 입력하세요 : ");
            String operator = s1.next();
            // 연산자와 정수 말고 이외에 것을 입력시 해결 방안 작성하기
            System.out.print("계산시 두번째로 사용할 정수를 입력하세요 : ");
            long secondNumber = s1.nextLong();
            switch (operator) {
                case "+" -> {
                    calendar0 = firstNumber + secondNumber;
                    calendar.addResults(calendar0);
                }
                case "-" -> {
                    calendar0 = firstNumber - secondNumber;
                    calendar.addResults(calendar0);
                }
                case "*" -> {
                    calendar0 = firstNumber * secondNumber;
                    calendar.addResults(calendar0);
                }
                case "/" -> {
                    if (firstNumber == 0) {
                        System.out.println("첫번째 정수값을 0으로 입력하셔서 나눌수 없습니다");
                    } else if (secondNumber == 0) {
                        System.out.println("두번째 정수값을 0으로 입력하셔서 나눌수 없습니다");
                    } else {
                        calendar0 = firstNumber / secondNumber;
                        calendar.addResults(calendar0);
                    }
                }
                default -> System.out.println("연산자 이외에 것을 입력을 했습니다.");
            }

            System.out.println("그만 하시겠습니까?");
            System.out.println("그만 하실려면 exit를 입력하시고 게속 하시고 싶으면 아무키나 누르시고 엔터 해주세요 : ");
            isFinished = s1.next();
        } while (!isFinished.equals("exit"));
        calendar.a6();
        calendar.a5();

    }
}
