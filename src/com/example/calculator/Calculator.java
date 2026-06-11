package com.example.calculator;

import java.util.ArrayList;


public class Calculator {
//    public static void main(String[] args) {
//        System.out.println("Hello, Calculator!");

        private final ArrayList<Long> results= new ArrayList<>();

        void addResults(long d) {
            results.add(d);
        }
        public void a6() {
            results.remove(results.get(0));
        }

        public void a5(){
            System.out.println("기록물" + results);
        }
        }