package com.yardspoon.logmill.screen.viewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.yardspoon.logmill.R;
import com.yardspoon.logmill.models.Logcat;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class ViewerActivity extends AppCompatActivity implements ViewerContract.View {

    @Inject ViewerContract.Presenter presenter;

    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);

        // NOTE: Temporary stand-in
        findViewById(R.id.pickAppFab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadLogs();
            }
        });
    }

    @Override
    public void showLogs(Logcat logcat) {
        // NOTE: Temporary stand-in
        Toast.makeText(this, logcat.getLogs().get(0), Toast.LENGTH_LONG).show();
    }
}
