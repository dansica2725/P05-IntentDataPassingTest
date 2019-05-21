package c346.rp.edu.sg.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button passInt, passChar;
    TextView passDbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passInt = findViewById(R.id.intBtn);
        passChar = findViewById(R.id.charBtn);

        passDbl = findViewById(R.id.doubleTv);

        passInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class).putExtra("value", 1));
            }
        });

        passChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ThirdActivity.class).putExtra("value", 'a'));
            }
        });

        passDbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FourthActivity.class).putExtra("value", 99.99));
            }
        });

    }
}
