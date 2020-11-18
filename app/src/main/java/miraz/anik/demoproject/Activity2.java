package miraz.anik.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {


    ImageView plus;
    ImageView minus;
    TextView count;

    int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide_up_activity);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        count = findViewById(R.id.count);

        plus.setOnClickListener(view -> count.setText(" " + ++counter));
        minus.setOnClickListener(view -> {
            if (counter > 0) count.setText(" " + --counter);
        });

    }
}