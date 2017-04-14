package com.yardspoon.logmill.base;


import android.content.Context;

import com.yardspoon.logmill.screen.viewer.ViewerDISubComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {ViewerDISubComponent.class})
public class ApplicationDIModule {
    @Provides Context provideContext(LogMillApplication application) {
        return application.getApplicationContext();
    }
}
