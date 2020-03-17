package com.example.singleton_example.getterandsetter;

public class EarlySingleTonGetterSetter {

    private static EarlySingleTonGetterSetter earlySingleTonGetterSetter = new EarlySingleTonGetterSetter();  //Early, instance will be created at load time



    private String className = "";

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    private EarlySingleTonGetterSetter(){

    }


    // the method which gives access to the only instance of SingletonCls
    public static EarlySingleTonGetterSetter getInstance(){
        return earlySingleTonGetterSetter;
    }
}
