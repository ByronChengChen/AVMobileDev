package com.example.testjni2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-tsubasa' library on application startup.
    static {
        System.loadLibrary("native-tsubasa");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native ®method
        TextView tv = findViewById(R.id.sample_text);
//        tv.setText(tsubasaFromJNI());
        tv.setText(hanabi());
    }

    /**
     * A native method that is implemented by the 'native-tsubasa' native library,
     * which is packaged with this application.
     */
//    public native String stringFromJNI();
//    public native String tsubasaFromJNI();
    public native String  hanabi();
}
