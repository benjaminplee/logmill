package com.yardspoon.logmill.screen.main;


import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainModule {
    @Binds
    abstract MainContract.View provideView(MainActivity activity);

    @Binds
    abstract MainContract.Presenter providesPresenter(MainPresenter presenter);
}
