package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {
  ListView list;

  String[] string = {"Australian Dollar","British Pound","Canadian Dollar","Chinese Yuan","Euro","Iranian Rial","Indian","Indonesians Rupiah","Japanese Yen","Kuwaiti Dinar","Malaysian Ringgit","New zealand Dollar","OmaniRial","Pakistani Rupee","Saudi Arabian Rival","Singapore Dollar","South Korean Wan","Sri Lankan Rupee ","Swiss Franc"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
//        try {
////        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
////                R.layout.activity_main3, string);
////         list = (ListView) findViewById(R.id.currencyList);
////         list.setAdapter(arrayAdapter);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                    R.layout.activity_main3, string);

            ListView listView = (ListView) findViewById(R.id.currencyList);
            listView.setAdapter(adapter);
//        }catch(Exception e){
//            System.out.println("hii");
//        }

    }
}