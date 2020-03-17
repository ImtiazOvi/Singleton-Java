package com.example.singleton_example.basic;

public class LazySingleTon {

    private static LazySingleTon singleTon_instance;

    public String className = "LazySingleTon";

    private LazySingleTon(){

    }

    public static LazySingleTon getInstance() {

        if (singleTon_instance == null) {
            singleTon_instance = new LazySingleTon();
        }
        return singleTon_instance;
    }
}
