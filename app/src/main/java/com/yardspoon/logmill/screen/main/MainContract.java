package com.yardspoon.logmill.screen.main;


public interface MainContract {
    interface View {
        void showLogs();
    }

    interface Presenter {
        void loadLogs();
    }
}
