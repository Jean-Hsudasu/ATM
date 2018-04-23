package com.example.user.atm;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editATM;
    private Button btn1,btn2,btn3;
    private Button btn4,btn5,btn6;
    private Button btn7,btn8,btn9;
    private Button btnback,btn0,btnok;
    private Button btnend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editATM = (EditText)findViewById(R.id.editATM);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnback = (Button)findViewById(R.id.btnback);
        btn0 = (Button)findViewById(R.id.btn0);
        btnok = (Button)findViewById(R.id.btnok);
        btnend = (Button)findViewById(R.id.btnend);

        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
        btn9.setOnClickListener(listener);
        btnback.setOnClickListener(listener);
        btn0.setOnClickListener(listener);
        btnok.setOnClickListener(listener);
        btnend.setOnClickListener(listener);
    }

    private Button.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
           switch (v.getId()) {
               case R.id.btn1:
                   displayATM("1");
                   break;
               case R.id.btn2:
                   displayATM("2");
                   break;
               case R.id.btn3:
                   displayATM("3");
                   break;
               case R.id.btn4:
                   displayATM("4");
                   break;
               case R.id.btn5:
                   displayATM("5");
                   break;
               case R.id.btn6:
                   displayATM("6");
                   break;
               case R.id.btn7:
                   displayATM("7");
                   break;
               case R.id.btn8:
                   displayATM("8");
                   break;
               case R.id.btn9:
                   displayATM("9");
                   break;
               case R.id.btn0:
                   displayATM("0");
                   break;
               case R.id.btnback:
                   String str = editATM.getText().toString();
                   if(str.length()>0)
                   {
                       str = str.substring(0,str.length()-1);
                       editATM.setText(str);
                   }
               case R.id.btnok:
                    str = editATM.getText().toString();
                    if(str.equals("5201314" ))
                    {
                        Toast toast = Toast.makeText(MainActivity.this,"正確!我也愛妳~~",Toast.LENGTH_LONG);
                        toast.show();
                    }
                    else
                    {
                        Toast toast = Toast.makeText(MainActivity.this,"在試一次 提示:七個數字",Toast.LENGTH_LONG);
                        toast.show();
                        editATM.setText("");
                    }
                    break;
               case R.id.btnend:
                   new AlertDialog.Builder(MainActivity.this)
                           .setTitle("確認視窗")
                           .setIcon(R.mipmap.ic_launcher)
                           .setMessage("確定要結束應用程式嗎?")
                           .setPositiveButton("確認", new DialogInterface.OnClickListener() {
                               @Override
                               public void onClick(DialogInterface dialog, int which)
                               {
                                   finish();
                               }
                           })

                           .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                               @Override
                               public void onClick(DialogInterface dialog, int which) {

                               }
                           })

                           .setNeutralButton("Skip", new DialogInterface.OnClickListener() {
                               @Override
                               public void onClick(DialogInterface dialog, int which) {

                               }
                           })
                           .show();
                   break;

           }
        }
    };
    private void displayATM(String s) {
        String str = editATM.getText().toString();
        editATM.setText(str+s);
    }
}
