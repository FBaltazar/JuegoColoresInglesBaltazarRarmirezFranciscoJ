package mx.edu.ittepic.dadm_u3_tclase_welcome_baltazarramirezfj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setContentView(new Lienzo2(this));
    }

}
