package id.sch.smktelkom_mlg.tugas01.xirpl6031.formulirdatasiswa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etAsal;
    Button bSend;
    TextView TvHasil;
    TextView TvAsal;
    RadioButton rpl, tkj;
    TextView jurus;
    TextView juru;
    CheckBox cbB, cbF, cbV;
    TextView eks;
    TextView akir;
    Spinner angk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
