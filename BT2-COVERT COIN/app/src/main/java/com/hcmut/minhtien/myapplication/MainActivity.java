package com.hcmut.minhtien.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btVU,btUV,btUE,btEU,btVE,btEV;
    EditText nhapso;
    TextView kq;

    View.OnClickListener myclick=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonVnUsd:
                String sa=nhapso.getText().toString();
                int a=Integer.parseInt(sa);
                kq.setText(a/22000.0+" ");
                break;
            case R.id.buttonUsdVn:
                String sa1=nhapso.getText().toString();
                int a1=Integer.parseInt(sa1);
                kq.setText(a1*22000+" ");
                break;
            case R.id.buttonUsdEuro:
                String sa2=nhapso.getText().toString();
                int a2=Integer.parseInt(sa2);
                kq.setText( (a2*0.8)+" ");
                break;
            case R.id.buttonEuroUsd:
                String sa3=nhapso.getText().toString();
                int a3=Integer.parseInt(sa3);
                kq.setText((a3/0.8)+" ");
                break;
            case R.id.buttonVnEuro:
                String sa4=nhapso.getText().toString();
                int a4=Integer.parseInt(sa4);
                kq.setText(a4/27500.0+" ");
                break;
            case R.id.buttonEuroVn:
                String sa5=nhapso.getText().toString();
                int a5=Integer.parseInt(sa5);
                kq.setText(a5*27500+" ");
                break;
        }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btVU=findViewById(R.id.buttonVnUsd);
        btUV=findViewById(R.id.buttonUsdVn);
        btUE=findViewById(R.id.buttonUsdEuro);
        btEU=findViewById(R.id.buttonEuroUsd);
        btVE=findViewById(R.id.buttonVnEuro);
        btEV=findViewById(R.id.buttonEuroVn);
        nhapso=findViewById(R.id.editTextNhap);
        kq=findViewById(R.id.textViewOut);

        //=========================================
        btVU.setOnClickListener(myclick);
        btUV.setOnClickListener(myclick);
        btUE.setOnClickListener(myclick);
        btEU.setOnClickListener(myclick);
        btVE.setOnClickListener(myclick);
        btEV.setOnClickListener(myclick);

    }
}
