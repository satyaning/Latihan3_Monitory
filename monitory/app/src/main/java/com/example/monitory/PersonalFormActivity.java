package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalFormActivity extends AppCompatActivity {

    public static final String INPUT_NICKNAME = "com.example.monitory.INPUT_NICKNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_form);
    }
    public void actNext(View view) {
        EditText nickName = (EditText) findViewById(R.id.fieldNickName);

        if(nickName.length() < 3) {
            Toast.makeText(this, "Nama panggilan harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, FinishActivity.class);
        intent.putExtra(INPUT_NICKNAME, nickName.getText().toString());
        startActivity(intent);
    }
}