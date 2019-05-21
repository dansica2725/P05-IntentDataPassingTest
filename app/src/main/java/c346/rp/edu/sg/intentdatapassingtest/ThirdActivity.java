package c346.rp.edu.sg.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv = findViewById(R.id.tv3);

        Intent recIntent = getIntent();

        char value = recIntent.getCharExtra("value", ' ');

        tv.setText("Character value received is: " + value);
    }
}
