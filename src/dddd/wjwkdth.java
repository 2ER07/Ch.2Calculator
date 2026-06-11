package dddd;
//  연산,저장,조건
import java.util.ArrayList;

public class wjwkdth {
    //    속성
   private Long firstNumber;  //첫번째로 정수
    private  Long secondNumber; // 두번째 정수
    private  String operator; // 연산자
    private Long history; //연산된 결과값을 컬렉션 넣기 위해 사용합니다.



//    기능
    // 연산
    public void isCalculating () {
        switch (operator) {
            case ("+"):
                history = firstNumber + secondNumber;
                break;
            case ("-"):
                history = firstNumber - secondNumber;
                break;
            case ("*"):
                history = firstNumber * secondNumber;
                break;
            case ("/"):
                if (secondNumber == 0) {
                    System.out.println("입력하신 값이 0은 이 계산기에서는 계산이 불가능합니다.");
                    return;
                } else {
                    history = firstNumber / secondNumber;
                    break;
                }
            default:
                System.out.println("연산 이외에 것을 입력을 했습니다.");
                return;

        }

        results.add(history);//연산 결과 값들을 컬렉션에 추가
    }
    private ArrayList<Long> results=new ArrayList<>(); //컬렉션을 ArrayList을 Long형태로 results이라는 저장소를 만들었다.


    public ArrayList<Long> results() { //게터로 메인에서 컬렉션에 값들을 출력하게 하는것
        return results;

    }

    public void oldest () {   //처음 전달 받은 값을 사용한다
        if (results.isEmpty()) {
            System.out.println("연산하신 게 없습니다");
            return;
        }results.remove(0);
    }

    //세터를 통해 캡술화 작업
    public void setFirstNumber(Long firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setOperator(String operator){
        this.operator=operator;
    }
    public void setSecondNumber(Long secondNumber){
        this.secondNumber=secondNumber;
    }
}

