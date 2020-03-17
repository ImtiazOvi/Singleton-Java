package com.example.singleton_example.getterandsetter;

public class LazySingleTonGetterSetter {

    private static LazySingleTonGetterSetter singleTon_instance;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    private String className = "";

    private LazySingleTonGetterSetter(){

    }

    public static LazySingleTonGetterSetter getInstance() {

        if (singleTon_instance == null) {
            singleTon_instance = new LazySingleTonGetterSetter();
        }
        return singleTon_instance;
    }
}
