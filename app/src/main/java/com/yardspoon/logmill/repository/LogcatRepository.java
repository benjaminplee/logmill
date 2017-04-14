package com.yardspoon.logmill.repository;


import com.yardspoon.logmill.models.Logcat;

import javax.inject.Inject;

import rx.Observable;
import rx.subjects.BehaviorSubject;


public class LogcatRepository {

    private BehaviorSubject<Logcat> logcatModel;

    @Inject
    public LogcatRepository(BehaviorSubject<Logcat> logcatModel) {
        this.logcatModel = logcatModel;
    }

    public Observable<RepositoryStatus> load() {
        // NOTE: Temporary test data
        logcatModel.onNext(new Logcat());
        return Observable.just(RepositoryStatus.SUCCESS);
    }
}
