package com.yardspoon.logmill.screen.main;


import javax.inject.Inject;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    @Inject
    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void loadLogs() {
        view.showLogs();
    }
}
