package br.com.jar.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private String mJoke;
    private TextView mJokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        getExtras();
        bindViews();
    }

    private void getExtras() {
        if (getIntent().hasExtra(Intent.EXTRA_INTENT)) {
            mJoke = getIntent().getStringExtra(Intent.EXTRA_INTENT);
        }
    }

    private void bindViews() {
        mJokeView = findViewById(R.id.tv_joke);
        mJokeView.setText(mJoke);
    }

}
