package com.yardspoon.logmill.base;


import android.app.Activity;

import com.yardspoon.logmill.screen.main.MainSubComponent;
import com.yardspoon.logmill.screen.main.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class BuildersModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindActivityInjectorFactory(MainSubComponent.Builder builder);
}
