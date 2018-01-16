package fauzi.hilmy.timeconvertion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etJam;
    Button button;
    TextView lblMenit, lblDetik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etJam = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        lblMenit = (TextView)findViewById(R.id.textView);
        lblDetik = (EditText)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Jam = etJam.getText().toString();
                double Hour = Double.parseDouble(Jam);

                double convMenit = Hour / 60;
                double convDetik = Hour / 3600;

                lblMenit.setText("Jadi, " + Hour + " jam = " + convMenit + " Menit");
                lblDetik.setText("Jadi, " + Hour + " jam = " + convDetik + " Detik");

            }
        });
    }
}
