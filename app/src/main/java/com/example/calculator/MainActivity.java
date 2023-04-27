package com.example.calculator;

import static java.lang.Math.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   MaterialButton zer_btn,one_btn,two_btn,thr_btn,fou_btn,fiv_btn,six_btn,sev_btn,eig_btn,nin_btn;
   MaterialButton m1_btn,m2_btn,m3_btn,m4_btn,d_btn,dot_btn,p_btn,s_btn,ps_btn,m_btn,ac_btn,b_btn,per_btn,eq_btn;
   EditText edt1;
   TextView edt2;
   String str = "",dup_str = " ";
   String result = "";
   String[] string  = new String[10];
   String [] sub_str = new String[10];
   int i =0;
   double number1,number2,number3;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        edt1 = findViewById(R.id.edt1);
//        edt2 = findViewById(R.id.edt2);
        {
            zer_btn = findViewById(R.id.zer_btn);
            zer_btn.setOnClickListener(this);
            one_btn = findViewById(R.id.one_btn);
            one_btn.setOnClickListener(this);
            two_btn = findViewById(R.id.two_btn);
            two_btn.setOnClickListener(this);
            thr_btn = findViewById(R.id.thr_btn);
            thr_btn.setOnClickListener(this);
            fou_btn = findViewById(R.id.fou_btn);
            fou_btn.setOnClickListener(this);
            fiv_btn = findViewById(R.id.fiv_btn);
            fiv_btn.setOnClickListener(this);
            six_btn = findViewById(R.id.six_btn);
            six_btn.setOnClickListener(this);
            sev_btn = findViewById(R.id.sev_btn);
            sev_btn.setOnClickListener(this);
            eig_btn = findViewById(R.id.eig_btn);
            eig_btn.setOnClickListener(this);
            nin_btn = findViewById(R.id.nin_btn);
            nin_btn.setOnClickListener(this);
            m1_btn = findViewById(R.id.m1_btn);
            m1_btn.setOnClickListener(this);
            m2_btn = findViewById(R.id.m2_btn);
            m2_btn.setOnClickListener(this);
            m3_btn = findViewById(R.id.m3_btn);
            m3_btn.setOnClickListener(this);
            m4_btn = findViewById(R.id.m4_btn);
            m4_btn.setOnClickListener(this);
            ac_btn = findViewById(R.id.ac_btn);
            ac_btn.setOnClickListener(this);
            b_btn = findViewById(R.id.bc_btn);
            b_btn.setOnClickListener(this);
            ps_btn = findViewById(R.id.ps_btn);
            ps_btn.setOnClickListener(this);
            d_btn = findViewById(R.id.d_btn);
            d_btn.setOnClickListener(this);
            m_btn = findViewById(R.id.m_btn);
            m_btn.setOnClickListener(this);
            p_btn = findViewById(R.id.p_btn);
            p_btn.setOnClickListener(this);
            s_btn = findViewById(R.id.s_btn);
            s_btn.setOnClickListener(this);
            per_btn = findViewById(R.id.per_btn);
            per_btn.setOnClickListener(this);
            eq_btn = findViewById(R.id.eq_btn);
            eq_btn.setOnClickListener(this);
            dot_btn = findViewById(R.id.dot_btn);
            dot_btn.setOnClickListener(this);
        }

    }

    @SuppressLint({"WrongViewCast", "SetTextI18n"})
    @Override
    public void onClick(View v) {
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        // todo
        //   1: in subtraction two - will come how to solve  .........
        //   2: after equal too if he want to print it will start from begin
        //   3: history managing with string[] array
        //   4: side view will create
        //   5: add working code for the buttons of m type and +/- button also

       // try {
            MaterialButton button = (MaterialButton) v;
            String btn = button.getText().toString();
            if (btn.equals("*") || btn.equals("/") || btn.equals("-") || btn.equals("%") || btn.equals("+") || btn.equals("+/-")) {

                if (i == 0) {
                    string[i] = str;
                    result = string[i];
                   // number3 = Double.parseDouble(result);
                    if(btn.equals("-")){
                        i= -1;
                    }

                } else {
                      try {
                          dup_str = str.replace(string[i - 1], result);
                          if (dup_str.contains("+")) {
                              sub_str = dup_str.split("[+]");
                              number1 = Double.parseDouble(sub_str[0]);
                              number2 = Double.parseDouble(sub_str[1]);
                              number3 = number1 + number2;
                              result = Double.toString(number3);

                          }  else if (dup_str.contains("*")) {
                              sub_str = dup_str.split("[*]");
                              number1 = Double.parseDouble(sub_str[0]);
                              number2 = Double.parseDouble(sub_str[1]);
                              number3 = number1 * number2;
                              result = Double.toString(number3);
                          } else if (dup_str.contains("/")) {
                              sub_str = dup_str.split("[/]");
                              number1 = Double.parseDouble(sub_str[0]);
                              number2 = Double.parseDouble(sub_str[1]);
                              number3 = number1 / number2;
                              result = Double.toString(number3);
                          } else if (dup_str.contains("+/-")) {
                              System.out.println("dsg");
                              /// todo //
                          } else if (dup_str.contains("%")) {
                              sub_str = dup_str.split("[%]");
                              number1 = Double.parseDouble(sub_str[0]);
                              number2 = Double.parseDouble(sub_str[1]);
                              number3 = number1 % number2;
                              result = Double.toString(number3);
                          }else if (dup_str.contains("-") && dup_str.charAt(0) != '-') {
                              sub_str = dup_str.split("[-]");
                              number1 = Double.parseDouble(sub_str[0]);
                              number2 = Double.parseDouble(sub_str[1]);
                              number3 = number1 - number2;
                              result = Double.toString(number3);

                          } else if (dup_str.contains("-")) {
                              sub_str = dup_str.split("[-]");
                              sub_str[0] = "-";
                              number1 = Double.parseDouble(sub_str[1]);
                              number2 = Double.parseDouble(sub_str[2]);
                              number3 = (-number1 )- number2;
                              result = Double.toString(number3);

                          }

                          // string[i] = str.substring(string[i-1].length()+1);
                          string[i] = dup_str;

                      }catch (Exception e) {
                            Toast.makeText(MainActivity.this, "error 1", Toast.LENGTH_SHORT).show();
                        }

                }

                  if(Math.abs(number3) != number3){
                       i= i -1;
                  }
                    //dup_str ="";
                    i++;
                    str = str + btn;
                    edt1.setText(str);
                    edt2.setText(result);



            } else if (btn.equals("=") || btn.equals("AC") || btn.equals("<---") || btn.equals("Mc") || btn.equals("M+") || btn.equals("M-") || btn.equals("Mr")) {
                if (btn.equals(("AC"))) {
                    str = "";
                    result = "";
                    i = 0;
                    edt1.setText(null);

                }
                if (btn.equals("=")) {
                    try {
                        dup_str = str.replace(string[i - 1], result);
                        if (dup_str.contains("+")) {
                            sub_str = dup_str.split("[+]");
                            number1 = Double.parseDouble(sub_str[0]);
                            number2 = Double.parseDouble(sub_str[1]);
                            number3 = number1 + number2;
                            result = Double.toString(number3);

                        } else if (dup_str.contains("*")) {
                            sub_str = dup_str.split("[*]");
                            number1 = Double.parseDouble(sub_str[0]);
                            number2 = Double.parseDouble(sub_str[1]);
                            number3 = number1 * number2;
                            result = Double.toString(number3);
                        } else if (dup_str.contains("/")) {
                            sub_str = dup_str.split("[/]");
                            number1 = Double.parseDouble(sub_str[0]);
                            number2 = Double.parseDouble(sub_str[1]);
                            number3 = number1 / number2;
                            result = Double.toString(number3);
                        } else if (dup_str.contains("+/-")) {
                            System.out.println("dsg");
                            //// todo ////
                        } else if (dup_str.contains("%")) {
                            sub_str = dup_str.split("[%]");
                            number1 = Double.parseDouble(sub_str[0]);
                            number2 = Double.parseDouble(sub_str[1]);
                            number3 = number1 % number2;
                            result = Double.toString(number3);
                        } else if (dup_str.contains("-") && dup_str.charAt(0) != '-') {
                            sub_str = dup_str.split("[-]");
                            number1 = Double.parseDouble(sub_str[0]);
                            number2 = Double.parseDouble(sub_str[1]);
                            number3 = number1 - number2;
                            result = Double.toString(number3);

                        } else if (dup_str.contains("-")) {
                            sub_str = dup_str.split("[-]");
                            //sub_str[0] = "-";
                            number1 = Double.parseDouble(sub_str[1]);
                            number2 = Double.parseDouble(sub_str[2]);
                            number3 = (-number1) - number2;
                            result = Double.toString(number3);

                        }

                        edt1.setText(result);
                        edt2.setText(null);
                        str = result;
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "error ", Toast.LENGTH_SHORT).show();
                    }
                }
                if (btn.equals("<---")) {
                    try {

                        StringBuilder sb = new StringBuilder(str);

                        sb.deleteCharAt(sb.length() - 1);
                        str = String.valueOf(sb);
                        result = "";
                        edt1.setText(str);
                    }catch(Exception e){
                        Toast.makeText(MainActivity.this, "error ", Toast.LENGTH_SHORT).show();
                    }
                }

            } else {


                str = str + btn;
                edt1.setText(str);
            }


//        }catch(Exception e){
//            Toast.makeText(MainActivity.this,"error",Toast.LENGTH_SHORT).show();
//        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id) {
            case R.id.exchange:
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                 startActivity(intent);
                 break;
            case R.id.menu_archive:
                Toast.makeText(this,"group_delete",Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}