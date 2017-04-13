package com.yardspoon.logmill.screen.viewer;


import com.yardspoon.logmill.repository.LogcatRepository;

import javax.inject.Inject;

public class ViewerPresenter implements ViewerContract.Presenter {

    private ViewerContract.View view;
    private LogcatRepository repository;

    @Inject
    public ViewerPresenter(ViewerContract.View view, LogcatRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    @Override
    public void loadLogs() {
        view.showLogs(repository.load());
    }
}
