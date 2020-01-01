package com.example.vibhor.toggleappdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private Button submitButton;
    private ToggleButton toggleButtonOn,toggleButtonOff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOnClickListener();
    }

    public void addOnClickListener()


    {

        toggleButtonOn= (ToggleButton) findViewById(R.id.toggleButton_on);
        toggleButtonOff= (ToggleButton) findViewById(R.id.toggleButton_off);
        submitButton= (Button) findViewById(R.id.btnDisplay);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                StringBuffer result= new StringBuffer();
                result.append("\nToggle button off").append(toggleButtonOff.getText());
                result.append("\nToggle button on").append(toggleButtonOn.getText());

                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();

            }
        });
    }
}
