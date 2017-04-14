package com.yardspoon.logmill.base;


import android.content.Context;

import com.yardspoon.logmill.models.Logcat;
import com.yardspoon.logmill.screen.viewer.ViewerDISubComponent;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

@Module(subcomponents = {ViewerDISubComponent.class})
public abstract class ApplicationDIModule {
    @Provides static Context provideContext(LogMillApplication application) {
        return application.getApplicationContext();
    }

    @Singleton
    @Provides static BehaviorSubject<Logcat> providesLogcatModel() {
        return BehaviorSubject.create();
    }

    @Binds abstract Observable<Logcat> providesLogcatModelObservable(BehaviorSubject<Logcat> logcat);
}
