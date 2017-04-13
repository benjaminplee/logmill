package com.yardspoon.logmill.base;

import com.yardspoon.logmill.screen.ScreenBuilderModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        ApplicationModule.class,
        ScreenBuilderModule.class})
public interface ApplicationComponent {

    @Component.Builder interface Builder {
        @BindsInstance Builder application(LogMillApplication application);

        ApplicationComponent build();
    }

    void inject(LogMillApplication application);
}
