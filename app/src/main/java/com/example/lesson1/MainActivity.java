package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = findViewById(R.id.ll_first);
        TextView textViewTop = findViewById(R.id.tv_first);
        EditText editTextTop = findViewById(R.id.et_first);
        TextView textView = findViewById(R.id.tv_second);

        Button button = findViewById(R.id.btn_pressMe);

        Switch sw = findViewById(R.id.sw_background);
        CheckBox checkBox = findViewById(R.id.cb_first);
        ToggleButton toggleButton = findViewById(R.id.tbtn_revers);
        Button button1 = findViewById(R.id.btn_nextTask);

        editTextTop.setOnKeyListener(new View.OnKeyListener()
                                  {
                                      @Override
                                      public boolean onKey(View v, int keyCode, KeyEvent event)
                                      {
                                          if(event.getAction() == KeyEvent.ACTION_DOWN &&
                                                  (keyCode == KeyEvent.KEYCODE_ENTER))
                                          {
                                              String val = editTextTop.getText().toString();
                                              textView.setText("Ух ты! Вы напечатали: " + val);
                                              return true;
                                          }
                                          return false;
                                      }
                                  }
        );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = String.valueOf(editTextTop.getText());
                textView.setText("Ух ты! Вы напечатали: " + val1);

            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()){
                toggleButton.setVisibility(View.VISIBLE);}
                else {
                    toggleButton.setVisibility(View.INVISIBLE);
                }
            }
        });

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((Switch) sw).isChecked();
                if(checked) {
                    linearLayout.setBackgroundColor(Color.BLACK);
                    textViewTop.setTextColor(Color.rgb(88,0,176));
                    editTextTop.setBackgroundColor(Color.rgb(193,202,205));

                    sw.setTextColor(Color.rgb(88,0,176));
                    checkBox.setTextColor(Color.rgb(88,0,176));
                    button.setBackgroundColor(Color.rgb(193,202,205));
                    button1.setBackgroundColor(Color.rgb(193,202,205));
                    button.setTextColor(Color.rgb(88,0,176));
                    button1.setTextColor(Color.rgb(88,0,176));
                } else {
                    linearLayout.setBackgroundColor(Color.rgb(193,202,205));
                    textViewTop.setTextColor(Color.rgb(252, 90, 80));
                    editTextTop.setBackgroundColor(Color.rgb(193,202,205));

                    sw.setTextColor(Color.BLACK);
                    checkBox.setTextColor(Color.BLACK);
                    button.setBackgroundColor(Color.rgb(41,49,51));
                    button1.setBackgroundColor(Color.rgb(41,49,51));
                    button.setTextColor(Color.rgb(252, 90, 80));
                    button1.setTextColor(Color.rgb(252, 90, 80));
                }

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main_two);
            }
        });










    }
}