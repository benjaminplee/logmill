package com.yardspoon.logmill.screen.viewer;


import com.yardspoon.logmill.repository.LogcatRepository;

public class ViewerPresenter implements ViewerMVPContract.Presenter {

    private ViewerMVPContract.View view;
    private LogcatRepository repository;

    public ViewerPresenter(ViewerMVPContract.View view, LogcatRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    @Override
    public void loadLogs() {
        view.showLogs(repository.load());
    }
}
