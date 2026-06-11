package com.example.calculator;

import java.util.ArrayList;


public class Calculator {
//    public static void main(String[] args) {
//        System.out.println("Hello, Calculator!");

        private ArrayList<Long> results= new ArrayList<>();

        public void addResults(long history) { //연산 결과 값 받아오기
            results.add(history);
        }
        public void a6() {          // 첫번째 결과물을 삭제
            try {                   // 아무 연산도 안하고 종료 시에 대한 대처
                if (results.isEmpty()) {
                    throw new IllegalArgumentException("실행한 연산들이 없습니다");
                } else{
                    results.remove(0);
                }
            } catch (IllegalArgumentException e) {

        }
        }

        public void a5(){      //그동안 모아운 결과값 출력
            System.out.println("기록물" + results);
        }
        }