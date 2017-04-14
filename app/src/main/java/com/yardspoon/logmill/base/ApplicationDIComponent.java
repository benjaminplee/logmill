package com.yardspoon.logmill.base;

import com.yardspoon.logmill.screen.ScreenDIBuilderModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        ApplicationDIModule.class,
        ScreenDIBuilderModule.class})
public interface ApplicationDIComponent {

    @Component.Builder interface Builder {
        @BindsInstance Builder application(LogMillApplication application);

        ApplicationDIComponent build();
    }

    void inject(LogMillApplication application);
}
