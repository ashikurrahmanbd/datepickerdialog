package com.example.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.datePicker);
        textView = (TextView) findViewById(R.id.textViewId);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePicker datePicker = new DatePicker(MainActivity.this);

                int currentYear = datePicker.getYear();

                int currentMonth = datePicker.getMonth()+1;

                int currentDay = datePicker.getDayOfMonth();


                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,

                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                                textView.setText(i + "/"+ i1 + "/"+ i2);
                            }
                        }, currentYear, currentMonth, currentDay);

                datePickerDialog.show();



            }
        });
    }
}
