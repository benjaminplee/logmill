package com.yardspoon.logmill;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

import com.yardspoon.logmill.base.MockLogMillApplication;


public class MockAppAndroidJunitRunner extends AndroidJUnitRunner {
    @Override
    public Application newApplication(ClassLoader cl, String className, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, MockLogMillApplication.class.getName(), context);
    }
}
