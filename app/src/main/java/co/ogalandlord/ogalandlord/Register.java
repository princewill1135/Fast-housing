package co.ogalandlord.ogalandlord;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private TextView tvregisteration;
    private EditText etusername, etemail, etpassword, etconfirm_pass;
    private Button btnlogin;
    private String registration, username, email, password, confirm_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tvregisteration = findViewById(R.id.tvregisteration);
        etusername = findViewById(R.id.etusername);
        etemail = findViewById(R.id.etemail);
        etpassword = findViewById(R.id.etpassword);
        etconfirm_pass = findViewById(R.id.etconfirm_pass);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validation();
            }
        });
    }

    private void validation() {
        registration = tvregisteration.getText().toString().trim();
        username = etusername.getText().toString().trim();
        email = etemail.getText().toString().trim();
        password = etpassword.getText().toString().trim();
        confirm_pass = etconfirm_pass.getText().toString().trim();

        if (TextUtils.isEmpty(username)) {
            etusername.setError("Username is empty");
        }


        if (TextUtils.isEmpty(email)) {
            etemail.setError("Email is empty");
        }


        if (TextUtils.isEmpty(password)) {
            etpassword.setError("Password is empty");
        }


        if (TextUtils.isEmpty(confirm_pass)) {
            etconfirm_pass.setError("Confirm password is empty");
        }
        else
            {
                Toast.makeText(this, "registration successful", Toast.LENGTH_SHORT).show();

        }
    }
}
