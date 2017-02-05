package np.com.maheshyadav.sum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variable Declaration

    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd, btnClear;

    double num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = (EditText)findViewById(R.id.txtNumber1);
        secondNumber = (EditText)findViewById(R.id.txtNumber2);
        addResult = (TextView)findViewById(R.id.txtResult);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnClear = (Button)findViewById(R.id.btnClear);

        btnAdd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(firstNumber.getText().toString().isEmpty())
                    num1=0;
                else
                    num1 = Double.parseDouble(firstNumber.getText().toString());
                if(secondNumber.getText().toString().isEmpty())
                    num2=0;
                else
                    num2 = Double.parseDouble(secondNumber.getText().toString());

                    sum = num1 + num2;
                    addResult.setText(Double.toString(sum));

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

               firstNumber.setText("");
                secondNumber.setText("");
                    addResult.setText("");
            }
        });
    }
}
