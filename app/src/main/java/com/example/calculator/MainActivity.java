package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,dot;
Button equal,sub,add,mul,div,pm,module,ac;
EditText ed;
TextView output;
String data;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Toast.makeText(this, "Namaste", Toast.LENGTH_SHORT).show();
        ed=findViewById(R.id.editText);
        output=findViewById(R.id.output);


        b1=findViewById(R.id.bu1);
       b2=findViewById(R.id.bu2);
       b3=findViewById(R.id.bu3);
       b4=findViewById(R.id.bu4);
       b5=findViewById(R.id.bu5);
       b6=findViewById(R.id.bu6);
       b7=findViewById(R.id.bu7);
       b8=findViewById(R.id.bu8);
       b9=findViewById(R.id.bu9);
       b0=findViewById(R.id.bu0);
       dot=findViewById(R.id.buDot);


       equal=findViewById(R.id.buEqual);
       add=findViewById(R.id.buPlus);
       sub=findViewById(R.id.buMinus);
       div=findViewById(R.id.buDivide);
       mul=findViewById(R.id.buMultiply);
       pm=findViewById(R.id.buPlusMinus);
       module=findViewById(R.id.buPercent);
       ac=findViewById(R.id.buAC);

       b0.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"0");
           }
       }));
       b1.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"1");
           }
       }));
       b2.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"2");
           }
       }));
       b3.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"3");
           }
       }));
       b4.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"4");
           }
       }));
       b5.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"5");
           }
       }));
       b6.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"6");
           }
       }));
       b7.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"7");
           }
       }));
       b8.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"8");
           }
       }));
       b9.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"9");
           }
       }));
       dot.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+".");
           }
       }));
       ac.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText("");
           }
       }));
       add.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"+");
           }
       }));
       sub.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"-");
           }
       }));
       mul.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"*");
           }
       }));
       div.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"/");
           }
       }));
       module.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               ed.setText(data+"%");
           }
       }));
       equal.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               data=ed.getText().toString();
               Context rhino=Context.enter();
               rhino.setOptimizationLevel(-1);
               String finalResult;
               Scriptable scriptable=rhino.initStandardObjects();
               finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
               output.setText(finalResult);
           }
       }));




    }



    }
