package com.saad.asaad.lesson5assignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText cupsInput;
    Button calculateButton;
    TextView tablespoonsOutput;
    TextView teaspoonsOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cupsInput = (EditText) findViewById(R.id.cupsInput);
        calculateButton = (Button) findViewById(R.id.calculateButton);
        tablespoonsOutput = (TextView) findViewById(R.id.tablespoonsOutput);;
        teaspoonsOutput = (TextView) findViewById(R.id.teaspoonsOutput);;

        calculateButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        double cups = Double.parseDouble(cupsInput.getText().toString());
        // 1 cup = 16 Tablespoon
        // 1 cup = 48 Teaspoon
        double tbsp = cups *48;
        double tsp = cups *16;
        tablespoonsOutput.setText(String.valueOf(tbsp) + " Tablespoons");
        teaspoonsOutput.setText(String.valueOf(tsp) + " Teaspoons");
    }


}
