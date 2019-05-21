package c346.rp.edu.sg.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = findViewById(R.id.tv2);

        Intent recIntent = getIntent();

        int value = recIntent.getIntExtra("value", 0);

        tv.setText("Integer value received is: " + value);

    }
}
