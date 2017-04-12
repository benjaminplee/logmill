package com.yardspoon.logmill.screen.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.yardspoon.logmill.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject MainContract.Presenter presenter;

    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // NOTE: Temporary stand-in
        findViewById(R.id.pickAppFab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadLogs();
            }
        });
    }

    @Override
    public void showLogs() {
        // NOTE: Temporary stand-in
        Toast.makeText(this, "Showing Logs", Toast.LENGTH_LONG).show();
    }
}
