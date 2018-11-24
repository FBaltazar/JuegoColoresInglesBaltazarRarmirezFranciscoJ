package mx.edu.ittepic.dadm_u3_tclase_welcome_baltazarramirezfj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(new Lorienzo(this));
    }
        public void v1()
        {
            Intent ven = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(ven);
        }
        public void v2()
        {
            Intent ven2 = new Intent(MainActivity.this,Main3Activity.class);
            startActivity(ven2);
        }


}
