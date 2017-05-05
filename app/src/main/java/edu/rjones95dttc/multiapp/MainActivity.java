package edu.rjones95dttc.multiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public static String MESSAGE_KEY = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnCreateStringClick(View view)
    {
        Intent intent = new Intent(this, SecondActivity.class);

        EditText etMainEditText = (EditText) findViewById(R.id.etMainEditText);
        String createdString = etMainEditText.getText().toString();

        intent.putExtra(MESSAGE_KEY, createdString);

        startActivity(intent);

        Toast.makeText(this, "Data Moved", Toast.LENGTH_SHORT).show();

        Intent intent2 = new Intent(this, MyIntentService.class);
        startService(intent2);
    }
}