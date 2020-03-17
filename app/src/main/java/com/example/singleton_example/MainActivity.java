package com.example.singleton_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.singleton_example.basic.EarlySingleton;
import com.example.singleton_example.basic.LazySingleTon;
import com.example.singleton_example.getterandsetter.EarlySingleTonGetterSetter;
import com.example.singleton_example.getterandsetter.LazySingleTonGetterSetter;
import com.example.singleton_example.nonsingleton.NonSingleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*This is non singleton*/
        NonSingleton nonSingleton = new NonSingleton();
        Log.d("Test", "is :---" + nonSingleton.className);


        /*This is lazy singleton */
        LazySingleTon mySingleTon = LazySingleTon.getInstance();
        Log.d("Test", "is :---" + mySingleTon.className);


        /*This is early singleton*/
        EarlySingleton earlySingleton = EarlySingleton.getInstance();
        Log.d("Test3", "is :---" + earlySingleton.className);



        /*This is early singleton with getter setter */
        EarlySingleTonGetterSetter earlySingleTonGetterSetter = EarlySingleTonGetterSetter.getInstance();
        earlySingleTonGetterSetter.setClassName("EarlySingleTonGetterSetter");
        Log.d("Test4", "is :---" + earlySingleTonGetterSetter.getClassName());


        /*This is lazy singleton with getter setter */
        LazySingleTonGetterSetter lazySingleTonGetterSetter = LazySingleTonGetterSetter.getInstance();
        lazySingleTonGetterSetter.setClassName("LazySingleTonGetterSetter");
        Log.d("Test4", "is :---" + lazySingleTonGetterSetter.getClassName());

    }
}
