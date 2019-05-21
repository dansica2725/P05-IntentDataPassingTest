package c346.rp.edu.sg.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tv = findViewById(R.id.tv4);

        Intent recIntent = getIntent();
        double value = recIntent.getDoubleExtra("value", 0);

        tv.setText("Double value received is: " + value);
    }
}
