package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {
   Spinner spinner1,spinner2;

   EditText edt1 ,edt2;
    MaterialButton zer_btn,one_btn,two_btn,thr_btn,fou_btn,fiv_btn,six_btn,sev_btn,eig_btn,nin_btn;
    MaterialButton dot_btn,ac_btn,b_btn;
    String[] string = {"Australian Dollar","British Pound","Canadian Dollar","Chinese Yuan","Euro","Iranian Rial","Indian","Indonesians Rupiah","Japanese Yen","Kuwaiti Dinar","Malaysian Ringgit","New zealand Dollar","OmaniRial","Pakistani Rupee","Saudi Arabian Rival","Singapore Dollar","South Korean Wan","Sri Lankan Rupee ","Swiss Franc"};
    String str = "";

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spinner1 =  findViewById(R.id.spin1);
        spinner2 = findViewById(R.id.spin2);
        spinner1.setOnItemSelectedListener( this);

        ArrayAdapter<String> aa1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,string);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner1.setAdapter(aa1);
        spinner2.setOnItemSelectedListener( this);

        ArrayAdapter<String> aa2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,string);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner2.setAdapter(aa2);
//        edt1 = findViewById(R.id.editText1);
//        edt2 = findViewById((R.id.editText2));

        {
            zer_btn = findViewById(R.id.zer_btn);
            zer_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = str+"0";

                }
            });
            one_btn = findViewById(R.id.one_btn);
            one_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = str+"1";

                }
            });

            two_btn = findViewById(R.id.two_btn);
            two_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = str+"2";

                }
            });

            thr_btn = findViewById(R.id.thr_btn);
            thr_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = str+"3";

                }
            });
            fou_btn = findViewById(R.id.fou_btn);
            fou_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = str+"4";


                }
            });
            fiv_btn = findViewById(R.id.fiv_btn);
            fiv_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = str+"5";


                }
            });
            six_btn = findViewById(R.id.six_btn);
            six_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = str+"6";


                }
            });
            sev_btn = findViewById(R.id.sev_btn);
            sev_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = str+"7";


                }
            });
            eig_btn = findViewById(R.id.eig_btn);
            eig_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = str+"8";


                }
            });
            nin_btn = findViewById(R.id.nin_btn);
            nin_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = str+"9";


                }
            });

            ac_btn = findViewById(R.id.ac_btn);
            ac_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = null;
                    str = "";

                }
            });
            b_btn = findViewById(R.id.bc_btn);
            b_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 str = str.substring(0,str.length() -1);
                }
            });


            dot_btn = findViewById(R.id.dot_btn);
            dot_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                str = str + ".";
                }
            });
        }

   }

    @SuppressLint("SetTextI18n")
//    @Override
//    public void onClick(View v) {
//        Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
//        startActivity(intent);
//    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        edt1 = findViewById(R.id.editText1);
        edt2 = findViewById((R.id.editText2));
        edt1.setText(str);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
//class Ram{
//    String[] string = {"Australian Dollar","British Pound","Canadian Dollar","Chinese Yuan","Euro","Iranian Rial","Indian","Indonesians Rupiah","Japanese Yen","Kuwaiti Dinar","Malaysian Ringgit","New zealand Dollar","OmaniRial","Pakistani Rupee","Saudi Arabian Rival","Singapore Dollar","South Korean Wan","Sri Lankan Rupee ","Swiss Franc"};
//
//
//
//}