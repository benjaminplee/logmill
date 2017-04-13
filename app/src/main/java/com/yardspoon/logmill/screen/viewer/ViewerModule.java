package com.yardspoon.logmill.screen.viewer;


import com.yardspoon.logmill.repository.LogcatRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class ViewerModule {
    @Provides ViewerContract.Presenter providesPresenter(ViewerActivity activity, LogcatRepository repository) {
        return new ViewerPresenter(activity, repository);
    }
}
