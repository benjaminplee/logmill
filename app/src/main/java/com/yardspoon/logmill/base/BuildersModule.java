package com.yardspoon.logmill.base;


import android.app.Activity;

import com.yardspoon.logmill.screen.viewer.ViewerSubComponent;
import com.yardspoon.logmill.screen.viewer.ViewerActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class BuildersModule {
    @Binds
    @IntoMap
    @ActivityKey(ViewerActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindActivityInjectorFactory(ViewerSubComponent.Builder builder);
}
