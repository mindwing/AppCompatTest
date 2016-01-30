package kr.mindwing.appcompattest;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        hideActionBar();
    }

    private void hideActionBar() {
        ActionBar actionBar = getSupportActionBar();

        String msg = actionBar == null ? "ActionBar is null" : "actionBar: " + actionBar.isHideOnContentScrollEnabled();

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

        if (actionBar != null) {
            actionBar.hide();
        }
    }
}
