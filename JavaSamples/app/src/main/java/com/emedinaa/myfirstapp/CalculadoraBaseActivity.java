package com.emedinaa.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraBaseActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "CalculadoraBaseA";
    private EditText editTextOp1;
    private EditText editTextOp2;
    private TextView tviOp;

    private View iviSum,iviSubtract,iviMultiply,iviDivide;

    private int op1,op2,op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ui();
    }

    private void ui() {

        editTextOp1= (EditText)findViewById(R.id.editTextOp1);
        editTextOp2= (EditText)findViewById(R.id.editTextOp2);
        tviOp= (TextView)findViewById(R.id.tviOp);

        iviSum= findViewById(R.id.iviSum);
        iviSubtract= findViewById(R.id.iviSubtract);
        iviMultiply= findViewById(R.id.iviMultiply);
        iviDivide= findViewById(R.id.iviDivide);

        iviSum.setOnClickListener(this);//java.lang.NullPointerException:
        iviSubtract.setOnClickListener(this);
        iviMultiply.setOnClickListener(this);
        iviDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //TODO capturar valores

        String mOp1= editTextOp1.getText().toString().trim();
        String mOp2= editTextOp2.getText().toString().trim();
        Log.v(TAG, "mOp1 "+mOp1 +" mOp2 "+mOp2);

        op1= Integer.parseInt(mOp1);
        op2= Integer.parseInt(mOp2);

        //TODO operaciones
        switch (v.getId())
        {
            case R.id.iviSum:

                op= op1+op2;
                Log.v(TAG, "sumar mOp "+op);

                break;

            case R.id.iviSubtract:
                op= op1-op2;
                Log.v(TAG, "restar");
                break;

            case R.id.iviMultiply:
                op= op1*op2;
                Log.v(TAG, "multiplicar");
                break;

            case R.id.iviDivide:
                //  java.lang.ArithmeticException: divide by zero
                if(op2!=0){
                    op= op1/op2;
                    Log.v(TAG, "dividir");
                }else{
                    editTextOp2.setError("Horror!");
                }
                break;

        }

        //TODO mostrar resultados
        tviOp.setText("Resultado "+op);

    }

    private int suma(int op1,int op2){
        return op1+op2;
    }

    private int restar(int op1,int op2){
        return op1+op2;
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
