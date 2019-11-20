package com.example.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;
    AlertDialog.Builder adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
    }

    public void btn1(View view) {
        adp = new AlertDialog.Builder(this);
        adp.setTitle("Massage for Mr. Albert. ");
        adp.setMessage("Button with only massage!");
        AlertDialog ab = adp.create();
        ab.show();
    }

    public void btn2(View view) {
        adp = new AlertDialog.Builder(this);
        adp.setTitle("Massage for Mr. Albert. ");
        adp.setMessage("Button with massage and icon!");
        adp.setIcon(R.drawable.ic_action_icon);
        AlertDialog ab = adp.create();
        ab.show();
    }

    public void btn3(View view) {
        adp = new AlertDialog.Builder(this);
        adp.setTitle("Massage for Mr. Albert. ");
        adp.setMessage("Button with massage and icon!");
        adp.setIcon(R.drawable.ic_action_icon);
        adp.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog ab = adp.create();
        ab.show();
    }

    public void btn4(View view) {
    }

    public void btn5(View view) {
    }
}
