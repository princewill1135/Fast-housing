package co.ogalandlord.ogalandlord;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private TextView tvlogin;
    private EditText etemail,etpassword;
    private Button btnlogin,btnnot_registered,btnforgotten;
    private String login,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        tvlogin = findViewById(R.id.tvlogin);
        etemail = findViewById(R.id.etemail);
        etpassword = findViewById(R.id.etpassword);
        btnlogin = findViewById(R.id.btnlogin);
        btnnot_registered = findViewById(R.id.btnnot_registered);
        btnforgotten = findViewById(R.id.btnforgotten_password);

        btnnot_registered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,Register.class));
            }
        });

        btnforgotten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,Forgotten.class));
            }
        });
    }
}
