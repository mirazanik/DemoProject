package miraz.anik.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide_up_activity);
        if (toast != null){
            toast.cancel();
        }
        toast = Toast.makeText(Activity2.this, "Working with Backend..", Toast.LENGTH_SHORT);
        toast.show();
    }
}