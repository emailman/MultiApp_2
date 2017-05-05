package edu.rjones95dttc.multiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static edu.rjones95dttc.multiapp.MainActivity.MESSAGE_KEY;

public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary_activity);

        Intent i = getIntent();

        String stringReceived = i.getStringExtra(MESSAGE_KEY);

        TextView tvStringReceived = (TextView) findViewById(R.id.tvCreatedString);
        tvStringReceived.setText(stringReceived);
    }

    public void onBtnPreviousClick(View view)
    {
        Toast.makeText(this, "Returning to Main", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
