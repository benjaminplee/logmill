package com.yardspoon.logmill.base;


import android.content.Context;

import com.yardspoon.logmill.screen.viewer.ViewerSubComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {ViewerSubComponent.class})
public class ApplicationModule {
    @Provides Context provideContext(LogMillApplication application) {
        return application.getApplicationContext();
    }
}
