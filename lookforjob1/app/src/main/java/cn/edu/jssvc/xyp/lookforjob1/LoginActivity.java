package cn.edu.jssvc.xyp.lookforjob1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button loginBtn, registerBtn;
    EditText userEt, passwordEt;

    CheckBox campanyCb, personCb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        loginBtn = (Button) findViewById(R.id.login_btn);
        registerBtn = (Button) findViewById(R.id.register_btn);
        loginBtn.setOnClickListener(this);
        registerBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn:
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}