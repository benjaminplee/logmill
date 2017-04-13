package com.yardspoon.logmill.base;

public class MockLogMillApplication extends LogMillApplication {
    @Override void setupDependencyInjection() {
        DaggerApplicationComponent
                .builder()
                .application(this)
                .build()
                .inject(this);


    }
}
