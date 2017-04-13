package com.yardspoon.logmill.screen.viewer;


import com.yardspoon.logmill.repository.LogcatRepository;

public class ViewerPresenter implements ViewerContract.Presenter {

    private ViewerContract.View view;
    private LogcatRepository repository;

    public ViewerPresenter(ViewerContract.View view, LogcatRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    @Override
    public void loadLogs() {
        view.showLogs(repository.load());
    }
}
