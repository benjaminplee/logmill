package com.yardspoon.logmill.screen.viewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yardspoon.logmill.R;
import com.yardspoon.logmill.models.Logcat;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class ViewerActivity extends AppCompatActivity implements ViewerMVPContract.View {

    @Inject ViewerMVPContract.Presenter presenter;

    private RecyclerView logListRecycler;

    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);

        findViewById(R.id.pickAppFab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().loadLogs();
            }
        });

        logListRecycler = (RecyclerView) findViewById(R.id.log_list);
        logListRecycler.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showLogs(Logcat logcat) {
        logListRecycler.setAdapter(new LogListAdapter(logcat.getLogs()));
    }

    @Override public void problemLoadingLogs() {

    }

    @Override public void logsLoaded() {

    }

    @Override public void loading() {

    }

    private ViewerMVPContract.Presenter getPresenter() {
        return presenter;
    }
}
