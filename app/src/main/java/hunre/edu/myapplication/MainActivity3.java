package hunre.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private EditText editTextA, editTextB, editTextC;
    private Button solveButton;
    private TextView resultTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);
        setContentView(R.layout.activity_main4);
        editTextA = findViewById(R.id.a);
        editTextB = findViewById(R.id.b);
        editTextC = findViewById(R.id.c);
        solveButton = findViewById(R.id.solveButton);
        resultTextView = findViewById(R.id.Kq);

        solveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solveQuadraticEquation();
            }
        });

    }
    private void solveQuadraticEquation() {
        double a = Double.parseDouble(editTextA.getText().toString());
        double b = Double.parseDouble(editTextB.getText().toString());
        double c = Double.parseDouble(editTextC.getText().toString());

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            resultTextView.setText("Nghiệm thứ nhất: " + root1 + "\nNghiệm thứ hai: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            resultTextView.setText("Nghiệm kép: " + root);
        } else {
            resultTextView.setText("Phương trình không có nghiệm thực.");
        }
    }
}