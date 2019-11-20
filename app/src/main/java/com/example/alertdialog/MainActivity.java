package com.example.alertdialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    /**
     * @author ofek gani
     * @version 0.1
     * @since 20.11
     */
    Button btn1, btn2, btn3, btn4, btn5;
    LinearLayout linearLayout;
    Intent intent;
    AlertDialog.Builder adp;
    Random rnd;
    int color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        linearLayout = findViewById(R.id.LinearLayout);
    }

    /**
     *
     * @param view get onClick
     */
    public void btn1(View view) {
        adp = new AlertDialog.Builder(this);
        adp.setTitle("Massage for Mr. Albert. ");
        adp.setMessage("Button with only massage!");
        AlertDialog ab = adp.create();
        ab.show();
    }
    /**
     *
     * @param view get onClick
     */
    public void btn2(View view) {
        adp = new AlertDialog.Builder(this);
        adp.setTitle("Massage for Mr. Albert. ");
        adp.setMessage("Button with massage and icon!");
        adp.setIcon(R.drawable.ic_stat_icon2);
        AlertDialog ab = adp.create();
        ab.show();
    }
    /**
     *
     * @param view get onClick
     */
    public void btn3(View view) {
        adp = new AlertDialog.Builder(this);
        adp.setTitle("Massage for Mr. Albert. ");
        adp.setMessage("Button with massage, icon and Cancel Button!!!!!!!!!");
        adp.setIcon(R.drawable.ic_action_icon);
        adp.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog ab = adp.create();
        ab.show();
    }
    /**
     *
     * @param view get onClick
     */
    public void btn4(View view) {
        adp = new AlertDialog.Builder(this);
        adp.setTitle("Massage for Mr. Albert. ");
        adp.setMessage("Button with massage, icon, Cancel Button and Random Background!!!!!!!!!!!!!!!!!!!");
        adp.setIcon(R.drawable.ic_action_icon);
        adp.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        adp.setNegativeButton("Change Background", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                rnd = new Random();
                color = Color.argb(255,rnd.nextInt(256),rnd.nextInt(256), rnd.nextInt(256));
                linearLayout.setBackgroundColor(color);
            }
        });
        AlertDialog ab = adp.create();
        ab.show();
    }
    /**
     *
     * @param view get onClick
     */
    public void btn5(View view) {
        adp = new AlertDialog.Builder(this);
        adp.setTitle("Massage for Mr. Albert. ");
        adp.setMessage("Button with massage, icon, Cancel Button,Random Background and... and Default Background!!!");
        adp.setIcon(R.drawable.ic_action_icon);
        adp.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        adp.setNeutralButton("Change Background", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                rnd = new Random();
                color = Color.argb(255,rnd.nextInt(256),rnd.nextInt(256), rnd.nextInt(256));
                linearLayout.setBackgroundColor(color);
            }
        });
        adp.setNegativeButton("Default Background", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                linearLayout.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ab = adp.create();
        ab.show();
    }

    /**
     *
     * @param menu Create Toggle Menu
     * @return menu to be displayed or Enable
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     *
     * @param item get item from the menu
     * @return item pressed
     */
    public boolean onOptionsItemSelected(MenuItem item){
        String st = item.getTitle().toString();
        if(st.equals("Home")){

        }
        if(st.equals("Credits")){
            intent = new Intent(this,Credits.class);
            startActivity(intent);
        }
        return true;
    }
}
