package lunainc.org.appsaludo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public EditText edit;
    public Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        edit = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = edit.getText().toString();


                if (texto.isEmpty()){
                    Toast.makeText(MainActivity.this, "Ingresa texto...", Toast.LENGTH_LONG).show();
                }else {
                    textView.setText(texto);
                    Toast.makeText(MainActivity.this, "Hola "+texto+" ¿Como estas?", Toast.LENGTH_LONG).show();


                }
            }
        });


    }
}
