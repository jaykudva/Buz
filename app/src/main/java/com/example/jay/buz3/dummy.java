package com.example.jay.buz3;
import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class dummy extends Activity implements OnClickListener {
    Context context = this;
    Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_settingspage);
            Button button = (Button) findViewById(R.id.dummy_button);
            button.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
        }
    }