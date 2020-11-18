package miraz.anik.demoproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout app_layer = (LinearLayout) findViewById(R.id.click1);


        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
                overridePendingTransition(R.transition.slide_in, R.transition.slide_out);
            }
        });


    }
}