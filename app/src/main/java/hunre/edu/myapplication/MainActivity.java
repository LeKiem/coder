package hunre.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  final  String TAG = getClass().getSimpleName();
    // 1. Khai bao cac thanh phan
    private EditText edtUser, edtPass;
    private Button btnLogin, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        // 2. Anh xa tu Layout
        anhxa();
        // 3. Xu lí logic , bat su kien cho cac nut...

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        // bat su kien cho Login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtUser.getText().toString().isEmpty()||  edtPass.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this,
                            "UserName hoac Pass khong duoc de trong",
                            Toast.LENGTH_LONG).show();
                } else if ( edtUser.getText().toString().equals("admin") && edtPass.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this,
                            "Dang nhap thanh cong",
                            Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this,"Dang nhap that bai", Toast.LENGTH_LONG ).show();
                }
            }
        });
    }

    private void anhxa() {
        edtUser = findViewById(R.id.edit_user);
        edtPass = findViewById(R.id.edit_pass);
        btnLogin = findViewById(R.id.btn_login);
        btnCancel = findViewById(R.id.btn_cancel);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}