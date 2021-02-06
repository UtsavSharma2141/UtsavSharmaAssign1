/*
Utsav Sharma n01392141 section C
 */
package utsav.sharma.n01392141;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class SharmaActivity extends AppCompatActivity {

    TextView tv;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharma);
        tv=findViewById(R.id.textView);
        st=getIntent().getExtras().getString("Value");
        tv.setText(st);

    }
        @Override
        protected void onStart() {
            super.onStart();
            Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                    getString(R.string.snackbar1), Snackbar.LENGTH_LONG);
            snackbar.show();
        }


    }

