package my.edu.utem.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.answer_textView);

    }

    public void ButtonPressed(View view) {
       // textView.setText("Test");
        switch (view.getId()){
            case R.id.add_button:
                if(count == 33) {
                    count = 0;
                    textView.setText(count + "");
                }
                else {
                    count++;
                    textView.setText(count + "");
                }
                break;
            case R.id.minus_button:
                if(count == 0)
                    Toast.makeText(MainActivity.this, "Number cannot be less than 0", Toast.LENGTH_LONG).show();
                else
                    count--;
                    textView.setText(count + "");
                break;
            case R.id.reset_button:
                count=0;
                textView.setText(count + "");
                break;
        }



    }
}
