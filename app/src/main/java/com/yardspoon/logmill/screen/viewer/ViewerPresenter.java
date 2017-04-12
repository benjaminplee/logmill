package com.yardspoon.logmill.screen.viewer;


import javax.inject.Inject;

public class ViewerPresenter implements ViewerContract.Presenter {

    private ViewerContract.View view;

    @Inject
    public ViewerPresenter(ViewerContract.View view) {
        this.view = view;
    }

    @Override
    public void loadLogs() {
        view.showLogs();
    }
}
