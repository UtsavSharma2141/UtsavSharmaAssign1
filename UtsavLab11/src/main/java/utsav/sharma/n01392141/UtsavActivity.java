/*
Utsav Sharma n01392141 section C
 */
package utsav.sharma.n01392141;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class UtsavActivity extends AppCompatActivity {
    Button btn;
    EditText et;
    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnActivity);
        et = findViewById(R.id.edittext);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UtsavActivity.this, SharmaActivity.class);
                st = et.getText().toString();
                i.putExtra("Value", st);
                startActivity(i);
                finish();
            }
        });
    }

    //
    //
    public void callIntent(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btnBrowser:
                Toast toast = Toast.makeText(getApplicationContext(), R.string.toast1_label, Toast.LENGTH_LONG);
                toast.show();
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://humber.ca/"));
                startActivity(intent);
                break;
            case R.id.btnActivity:
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        getString(R.string.snackbar1), Snackbar.LENGTH_LONG);
                snackbar.show();
                intent = new Intent(this, SharmaActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}
