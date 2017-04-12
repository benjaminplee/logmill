package com.yardspoon.logmill.base;


import android.content.Context;

import com.yardspoon.logmill.screen.main.MainSubComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {MainSubComponent.class})
public class ApplicationModule {
    @Provides
    Context provideContext(LogMillApplication application) {
        return application.getApplicationContext();
    }
}
