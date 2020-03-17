package com.example.singleton_example.basic;

public class EarlySingleton {

    private static EarlySingleton earlySingleton = new EarlySingleton();  //Early, instance will be created at load time

    public String className = "EarlySingleton";

    private EarlySingleton(){

    }


    // the method which gives access to the only instance of SingletonCls
    public static EarlySingleton getInstance(){
        return earlySingleton;
    }


}
