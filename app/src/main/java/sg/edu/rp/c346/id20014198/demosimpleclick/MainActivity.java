package sg.edu.rp.c346.id20014198.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    RadioGroup rgGender;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
                int checkedRadioId = rgGender.getCheckedRadioButtonId();

                if(checkedRadioId == R.id.radioButtonGenderMale){
                    tvDisplay.setText("He says "+stringResponse);
                } else{
                    tvDisplay.setText("She says "+stringResponse);
                }

            }
        });
             tbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                if (tbtn.isChecked()) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }
            }
        });
    }
}