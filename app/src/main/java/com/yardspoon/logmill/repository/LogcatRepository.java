package com.yardspoon.logmill.repository;


import com.yardspoon.logmill.models.Logcat;

import javax.inject.Inject;

public class LogcatRepository {

    @Inject
    public LogcatRepository() {
    }

    public Logcat load() {
        return new Logcat();
    }
}
