package com.yardspoon.logmill.screen.viewer;


import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewerModule {
    @Binds abstract ViewerContract.View provideView(ViewerActivity activity);

    @Binds abstract ViewerContract.Presenter providesPresenter(ViewerPresenter presenter);
}
