package phoenix.tweety.tellmyage;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tellage;
    TextView displayage;
    Button press;
    int yearOfBirth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tellage = (EditText)findViewById(R.id.presentage);
        displayage = (TextView)findViewById(R.id.displayage);
        press = (Button)findViewById(R.id.press);
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              yearOfBirth = Integer.parseInt(tellage.getText().toString());
              int  currentYear = Calendar.getInstance().get(Calendar.YEAR);
              int myAge = currentYear - yearOfBirth;
              displayage.setText("Your age is "+String.valueOf(myAge));
            }
        });
    }
}
