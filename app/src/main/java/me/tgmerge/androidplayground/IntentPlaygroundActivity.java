package me.tgmerge.androidplayground;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntentPlaygroundActivity extends AppCompatActivity {

    public static void openActivity(Context context) {
        Intent intent = new Intent(context, IntentPlaygroundActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_playground);
    }
}
