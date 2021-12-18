package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    TextView num1 , num2;
    Button add,sub,mul,div,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.button1);
        sub = findViewById(R.id.button2);
        mul = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        reset = findViewById(R.id.button5);
        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno=Integer.parseInt(num1.getText().toString());
                int sno=Integer.parseInt(num2.getText().toString());
                int res =fno+sno;
                Toast.makeText(MainActivity.this,"Result: "+res,
                        Toast.LENGTH_LONG).show();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno = Integer.parseInt(num1.getText().toString());
                int sno = Integer.parseInt(num2.getText().toString());
                int res=fno-sno;
                Toast.makeText(MainActivity.this,"Result:"+res,
                        Toast.LENGTH_LONG).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno = Integer.parseInt(num1.getText().toString());
                int sno = Integer.parseInt(num2.getText().toString());
                int res=fno*sno;
                Toast.makeText(MainActivity.this,"Result:"+res,
                        Toast.LENGTH_LONG).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno = Integer.parseInt(num1.getText().toString());
                int sno = Integer.parseInt(num2.getText().toString());
                if(sno==0){
                    Toast.makeText(MainActivity.this,"Error:Division by zero",
                            Toast.LENGTH_LONG).show();
                }
                else{
                    int res = fno / sno;
                    Toast.makeText(MainActivity.this,"Result : "
                            +res,Toast.LENGTH_LONG).show();
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                Toast.makeText(MainActivity.this, "Reset Done",
                        Toast.LENGTH_SHORT).show();
            }