package dddd;

import java.util.Scanner;

//흐름,입력
public class dustks {
    public static void main(String[] args) {
        Scanner operator = new Scanner(System.in);
        wjwkdth calendar = new wjwkdth();
        String isFinished;
        do {
            System.out.print("계산시 사용할 첫번째 정수 입력하세요 : ");
            calendar.firstNumber=operator.nextLong();
            System.out.print("계산시 사용할 연산자 입력하세요(예:+,-,*,/) : ");
            calendar.operator=operator.next();
            System.out.print("계산시 사용할 두번째 정수 입력하세요 : ");
            calendar.secondNumber=operator.nextLong();
            calendar.isCalculating();

            System.out.println("계산을 이어서 하실건가요?(안하실거면 exit를 입력해주세요)");
            isFinished=operator.next();
        }while (!isFinished.equals("exit"));

        System.out.println("결과 값 : "+calendar.results());
        calendar.oldest();
        System.out.println("결과 값 : "+calendar.results());


    }
}
