package com.yardspoon.logmill.screen.viewer;


import com.yardspoon.logmill.repository.LogcatRepository;
import com.yardspoon.logmill.repository.RepositoryStatus;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;


public class ViewerPresenter implements ViewerMVPContract.Presenter {

    private ViewerMVPContract.View view;
    private LogcatRepository repository;

    public ViewerPresenter(ViewerMVPContract.View view, LogcatRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    @Override
    public void loadLogs() {
        repository.load()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<RepositoryStatus>() {

                    @Override public void onCompleted() {

                    }

                    @Override public void onError(Throwable e) {
                        view.problemLoadingLogs();
                    }

                    @Override public void onNext(RepositoryStatus repositoryStatus) {
                        if (RepositoryStatus.SUCCESS.equals(repositoryStatus)) {
                            view.logsLoaded();
                        } else {
                            view.problemLoadingLogs();
                        }
                    }
                });

        view.loading();
    }
}
